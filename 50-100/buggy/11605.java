private org.eclipse.jface.viewers.StyledString getStyledString(com.boothen.jsonedit.outline.NodeType type, java.lang.String key, java.lang.String value) {
    java.lang.String fgColor = type.getForegroundColor();
    java.lang.String bkColor = type.getBackgroundColor();
    org.eclipse.jface.viewers.StyledString text = new org.eclipse.jface.viewers.StyledString();
    text.append(key);
    text.append(": ");
    text.append(value, org.eclipse.jface.viewers.StyledString.createColorRegistryStyler(fgColor, bkColor));
    return text;
}