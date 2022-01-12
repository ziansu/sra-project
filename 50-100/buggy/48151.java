@java.lang.Override
public boolean setPropertyFromTag(com.github.kubatatami.richedittext.BaseRichEditText editText, java.util.Map<java.lang.String, java.lang.String> styleMap) {
    if (styleMap.containsKey("line-height")) {
        float lineHeight = java.lang.Float.parseFloat(styleMap.get("line-height"));
        editText.setLineSpacing(1.0F, lineHeight);
        return true;
    }
    return false;
}