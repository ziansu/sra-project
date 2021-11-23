protected boolean getKeepEditorOnClickDisabledRows(org.json.JSONObject gridElem) {
    java.lang.String keepEditor = gridElem.optString("keepEditorOnClickDisabledRows");
    if ((keepEditor != null) && ((keepEditor.trim().length()) > 0)) {
        return java.lang.Boolean.parseBoolean(keepEditor);
    }
    return false;
}