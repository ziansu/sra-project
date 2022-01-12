@java.lang.Override
public org.json.JSONObject getJSON() {
    org.json.JSONObject obj = super.getJSON();
    if ((this.dataKey) != null) {
        rdfbones.lib.JSON.put(obj, "dataKey", this.dataKey);
    }
    org.json.JSONObject formElements = this.subForm.getSubFormJSON();
    if ((formElements.length()) > 0) {
        rdfbones.lib.JSON.put(obj, "formElements", formElements);
    }
    return obj;
}