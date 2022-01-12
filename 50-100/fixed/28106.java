public static java.lang.String getLocaleValue(java.util.List<fi.metatavu.kuntaapi.server.rest.model.LocalizedValue> items, java.lang.String type, java.lang.String language) {
    if (items == null) {
        return null;
    }
    for (fi.metatavu.kuntaapi.server.rest.model.LocalizedValue item : items) {
        if (((type == null) || (item.getType().equals(type))) && (org.apache.commons.codec.binary.StringUtils.equals(language, item.getLanguage()))) {
            return item.getValue();
        }
    }
    return null;
}