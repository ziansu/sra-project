public void show() throws java.lang.Exception {
    if ((notepadButtonView) == null) {
        notepadButtonView = new com.anwesome.demos.notepadbutton.NotepadButton.NotepadButtonView(activity);
        android.graphics.Point size = com.anwesome.ui.dimensionsutil.DimensionsUtil.getDeviceDimension(activity);
        int w = size.x;
        notepad = com.anwesome.demos.notepadbutton.Notepad.getInstance((w / 4), (w / 4), (w / 4), text);
        activity.addContentView(notepadButtonView, new android.view.ViewGroup.LayoutParams((w / 2), (w / 2)));
    }
}