public void setState(@javax.annotation.Nonnull
final org.solovyev.android.calculator.EditorState state) {
    org.solovyev.android.Check.isMainThread();
    reportChanges = false;
    if ((org.solovyev.android.calculator.App.getTheme().light) && (isFloatingCalculator())) {
        setText(state.getTextString());
    }else {
        setText(state.text, BufferType.EDITABLE);
    }
    setSelection(org.solovyev.android.calculator.Editor.clamp(state.selection, length()));
    reportChanges = true;
}