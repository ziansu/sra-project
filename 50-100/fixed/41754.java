private java.lang.String getListItemString(android.view.View row) {
    java.lang.StringBuilder json = new java.lang.StringBuilder("{");
    if (row instanceof android.widget.TextView) {
        addViewInfo(json, ((android.widget.TextView) (row)));
    }else
        if (row instanceof android.view.ViewGroup) {
            addViewInfo(json, ((android.view.ViewGroup) (row)));
        }
    
    json.append('}');
    return json.toString();
}