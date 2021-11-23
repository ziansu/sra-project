@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getParameter() {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
    result.put(ICommandID.SET_COORDINATE_SYSTEM_PARAMETER, ("" + ((partTools.parseInteger(coordSystemCombo.getText(), 54)) - 53)));
    return result;
}