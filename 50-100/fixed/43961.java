public void load() {
    if ((config) != null) {
        java.util.Set<java.lang.String> keySet = config.getKeys(false);
        for (java.lang.String key : keySet) {
            io.github.dre2n.dungeonsxl.file.DMessages.Messages message = io.github.dre2n.dungeonsxl.file.DMessages.Messages.getByIdentifier(key);
            if (message != null) {
                message.setMessage(config.getString(key));
            }
        }
    }
}