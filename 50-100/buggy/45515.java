private static java.lang.String getExtension(java.lang.String uri) {
    int lastDotIndex = uri.lastIndexOf('.');
    java.lang.String extension;
    if (lastDotIndex > 1) {
        extension = uri.substring(lastDotIndex);
    }else {
        try {
            extension = com.orctom.laputa.service.config.Configurator.getInstance().getConfig().getString("default.extension");
        } catch (java.lang.Exception e) {
            extension = JsonResponseTranslator.TYPE.getExtension();
        }
    }
    return extension;
}