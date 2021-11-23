protected void processNotFoundMessage(org.bitcoinj.core.NotFoundMessage m) {
    for (org.bitcoinj.core.Peer.GetDataRequest req : getDataFutures) {
        for (org.bitcoinj.core.InventoryItem item : m.getItems()) {
            if (item.hash.equals(req.hash)) {
                org.bitcoinj.core.Peer.log.info("{}: Bottomed out dep tree at {}", this, req.hash);
                req.future.cancel(true);
                getDataFutures.remove(req);
                break;
            }
        }
    }
}