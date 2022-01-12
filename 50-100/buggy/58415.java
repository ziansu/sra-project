protected void appendValue(java.lang.Object object) {
    if (object == null) {
        style.appendNull(sb);
    }else {
        if (object instanceof cz.lidinsky.tools.IToStringBuildable) {
            appendValue(((cz.lidinsky.tools.IToStringBuildable) (object)));
        }else
            if (object instanceof java.lang.Integer) {
                style.appendValue(sb, ((java.lang.Integer) (object)).intValue());
            }else {
                style.appendValue(object);
            }
        
    }
}