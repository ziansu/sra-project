protected void configureSourceViewerDecorationSupport(org.eclipse.ui.texteditor.SourceViewerDecorationSupport support) {
    java.util.Iterator<org.eclipse.ui.texteditor.AnnotationPreference> e = fAnnotationPreferences.getAnnotationPreferences().iterator();
    while (e.hasNext())
        support.setAnnotationPreference(e.next());
    
    support.setCursorLinePainterPreferenceKeys(org.eclipse.ui.texteditor.AbstractDecoratedTextEditor.CURRENT_LINE, org.eclipse.ui.texteditor.AbstractDecoratedTextEditor.CURRENT_LINE_COLOR);
    support.setMarginPainterPreferenceKeys(org.eclipse.ui.texteditor.AbstractDecoratedTextEditor.PRINT_MARGIN, org.eclipse.ui.texteditor.AbstractDecoratedTextEditor.PRINT_MARGIN_COLOR, org.eclipse.ui.texteditor.AbstractDecoratedTextEditor.PRINT_MARGIN_COLUMN);
}