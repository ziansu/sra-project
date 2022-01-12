private static nth.introspect.layer5provider.reflection.behavior.fieldmode.FieldModeType getFieldModeTypeForDateTime(java.lang.String formatPattern) {
    if (formatPattern == null) {
        return FieldModeType.DATE_TIME;
    }
    boolean hasDate = false;
    boolean hasTime = false;
    if (nth.introspect.generic.util.StringUtil.containsCharacter(formatPattern, "GyYMwWDdFEu")) {
        hasDate = true;
    }
    if (nth.introspect.generic.util.StringUtil.containsCharacter(formatPattern, "aHkKhmsSzZX")) {
        hasTime = true;
    }
    if (hasDate && hasTime) {
        return FieldModeType.DATE_TIME;
    }else
        if (hasDate) {
            return FieldModeType.DATE;
        }
    
    return FieldModeType.TIME;
}