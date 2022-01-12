public static edu.umass.cs.gnsserver.utils.ValuesMap runCode(edu.umass.cs.gnsserver.interfaces.InternalRequestHeader header, java.lang.String code, java.lang.String guid, java.lang.String field, java.lang.String action, edu.umass.cs.gnsserver.utils.ValuesMap valuesMap, int activeCodeTTL) {
    try {
        return edu.umass.cs.gnsserver.activecode.ActiveCodeHandler.handler.runCode(header, guid, field, code, valuesMap, activeCodeTTL);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return valuesMap;
}