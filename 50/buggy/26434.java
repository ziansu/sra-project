private java.lang.String translate(java.lang.String in) throws be.tutul.naheulcraft.updater.exception.NaheulCraftException {
    try {
        return ((be.tutul.naheulcraft.updater.utils.PropertiesUtils) (properties)).translate(in);
    } catch (java.lang.Exception e) {
        throw new be.tutul.naheulcraft.updater.exception.NaheulCraftException("plop", e);
    }
}