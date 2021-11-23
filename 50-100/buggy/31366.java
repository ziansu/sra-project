public void removeHash(long timestamp, java.lang.String hash) {
    jacz.peerengineclient.data.RemotePeerShare.logger.info(((("Removed shared file for peer " + (localStorage.getString(jacz.peerengineclient.data.RemotePeerShare.REMOTE_PEER_ID_KEY))) + ": ") + hash));
    long oldTimestamp = activeHashes.removeReverse(hash);
    localStorage.removeItem(jacz.peerengineclient.data.RemotePeerShare.HASH_CATEGORY, java.lang.Long.toString(oldTimestamp));
    updateTimestamp(timestamp);
    foreignShares.removeResourceProvider(hash, new jacz.peerengineservice.PeerId(localStorage.getString(jacz.peerengineclient.data.RemotePeerShare.REMOTE_PEER_ID_KEY)));
}