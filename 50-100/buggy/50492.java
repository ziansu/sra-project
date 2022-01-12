@java.lang.Override
public boolean setPropertyFromTag(android.text.SpannableStringBuilder editable, java.util.Map<java.lang.String, java.lang.String> styleMap) {
    if (styleMap.containsKey(com.github.kubatatami.richedittext.styles.line.AlignmentSpanController.TEXT_ALIGN)) {
        com.github.kubatatami.richedittext.styles.line.AlignmentSpanController.RichAlignmentSpanStandard span = createSpan(styleMap, null);
        if (span != null) {
            performSpan(createSpan(styleMap, null), editable, com.github.kubatatami.richedittext.modules.StyleSelectionInfo.getStyleSelectionInfo(editable));
            return true;
        }
    }
    return false;
}