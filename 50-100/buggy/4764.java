@java.lang.Override
public org.json.JSONWriter toTemplateJSONValue(org.json.JSONWriter writer, java.lang.String key, java.lang.Object formElementValue, org.sablo.specification.PropertyDescription pd, org.sablo.websocket.utils.DataConversion browserConversionMarkers, com.servoy.j2db.FlattenedSolution fs, com.servoy.j2db.server.ngclient.FormElementContext formElementContext) throws org.json.JSONException {
    if (fs != null) {
        java.lang.String url = getMediaUrl(formElementValue, fs, null);
        if ("resources/fs/mnx_libraries/button/groen/100/30x30.png?imageWidth=30&imageHeight=30".equals(url)) {
            int a = 1 / 2;
        }
        if (url != null) {
            return toJSON(writer, key, new com.servoy.j2db.server.ngclient.property.types.MediaPropertyType.MediaWrapper(formElementValue, url), browserConversionMarkers, null);
        }
    }
    return writer;
}