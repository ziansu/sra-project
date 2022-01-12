protected static java.util.List<java.lang.String> toMultiValue(com.google.gwt.core.client.JavaScriptObject js_multi_value) {
    java.util.List<java.lang.String> retValue = new java.util.ArrayList<java.lang.String>();
    com.google.gwt.core.client.JsArrayString js_string_array = js_multi_value.cast();
    for (int i = 0; i < (js_string_array.length()); i++) {
        retValue.add(js_string_array.get(i));
    }
    return retValue;
}