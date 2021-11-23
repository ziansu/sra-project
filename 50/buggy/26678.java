private void importToJama(java.util.List<com.github.jasongoetz.asanajama.domain.Item> jamaItems) {
    for (com.github.jasongoetz.asanajama.domain.Item item : jamaItems) {
        try {
            jamaGateway.createItem(item);
        } catch (com.github.jasongoetz.asanajama.exception.GatewayException e) {
            e.printStackTrace();
        }
    }
}