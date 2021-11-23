public int getGID() {
    int result = -1;
    try {
        result = nationbuilder.lib.data.map.xml.XmlHelper.getInt(this.element, "gid");
        return result;
    } catch (java.lang.NumberFormatException ex) {
        nationbuilder.lib.Logging.Log.writeInfo("gid attribute fetch failed, trying id attribute");
    }
    try {
        result = nationbuilder.lib.data.map.xml.XmlHelper.getInt(this.element, "id");
        return result;
    } catch (java.lang.NumberFormatException ex) {
        nationbuilder.lib.Logging.Log.writeError("Parsing of the Tile GID attribute failed");
        return result;
    }
}