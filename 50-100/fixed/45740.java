public static java.lang.String beginStyle(java.lang.Object span) {
    android.text.Layout.Alignment spanValue = ((com.github.kubatatami.richedittext.styles.line.AlignmentSpanController.RichAlignmentSpanStandard) (span)).getAlignment();
    java.lang.String alignValue;
    switch (spanValue) {
        case ALIGN_CENTER :
            alignValue = "center";
            break;
        case ALIGN_OPPOSITE :
            alignValue = "right";
            break;
        default :
        case ALIGN_NORMAL :
            alignValue = "left";
            break;
    }
    return ((com.github.kubatatami.richedittext.styles.line.AlignmentSpanController.TEXT_ALIGN) + ": ") + alignValue;
}