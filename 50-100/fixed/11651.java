@java.lang.Override
public java.lang.String getJSON() {
    javax.json.JsonObject json = org.jtool.macrorecorder.macro.MacroJSON.getJSONObjectBuikder(this).add(MacroJSON.JSON_ATTR_CODE, code).add(MacroJSON.JSON_ATTR_CHARSET, charset).add(MacroJSON.JSON_ATTR_SRD_DST_PATH, srcDstPath).build();
    return org.jtool.macrorecorder.macro.MacroJSON.stringify(json);
}