private void enableChannelPanel(java.util.HashMap<java.lang.String, java.awt.Component> channelHashMap, java.lang.Boolean enable) {
    for (java.lang.String param : channelHashMap.keySet()) {
        if (param.equals(USING)) {
            channelHashMap.get(param).setEnabled(enable);
        }
    }
}