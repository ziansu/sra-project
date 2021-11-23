@java.lang.Override
protected void doConfigureViewer() {
    fForegroundColor = updateColorFromSetting(fForegroundColor, AbstractTextEditor.PREFERENCE_COLOR_FOREGROUND_SYSTEM_DEFAULT, AbstractTextEditor.PREFERENCE_COLOR_FOREGROUND);
    styledText.setForeground(fForegroundColor);
    fBackgroundColor = updateColorFromSetting(fBackgroundColor, AbstractTextEditor.PREFERENCE_COLOR_BACKGROUND_SYSTEM_DEFAULT, AbstractTextEditor.PREFERENCE_COLOR_BACKGROUND);
    styledText.setBackground(fForegroundColor);
    fSelectionForegroundColor = updateColorFromSetting(fSelectionForegroundColor, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SELECTION_FOREGROUND_DEFAULT_COLOR, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SELECTION_FOREGROUND_COLOR);
    styledText.setSelectionForeground(fSelectionForegroundColor);
    fSelectionBackgroundColor = updateColorFromSetting(fSelectionBackgroundColor, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SELECTION_BACKGROUND_DEFAULT_COLOR, AbstractDecoratedTextEditorPreferenceConstants.EDITOR_SELECTION_BACKGROUND_COLOR);
    styledText.setSelectionBackground(fSelectionBackgroundColor);
}