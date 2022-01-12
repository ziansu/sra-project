@java.lang.Override
public org.json.JSONWriter toTemplateJSONValue(org.json.JSONWriter writer, java.lang.String key, java.lang.String formElementValue, org.sablo.specification.PropertyDescription pd, org.sablo.websocket.utils.DataConversion browserConversionMarkers, com.servoy.j2db.FlattenedSolution fs, com.servoy.j2db.server.ngclient.FormElementContext formElementContext) throws org.json.JSONException {
    com.servoy.j2db.server.ngclient.property.types.TagStringConfig config = getConfig(pd);
    if ((formElementValue != null) && (valueInTemplate(formElementValue, pd, formElementContext))) {
        org.sablo.websocket.utils.JSONUtils.addKeyIfPresent(writer, key);
        if (com.servoy.j2db.util.HtmlUtils.startsWithHtml(formElementValue)) {
            writer.value("<html></html>");
        }else
            writer.value(formElementValue);
        
    }
    return writer;
}