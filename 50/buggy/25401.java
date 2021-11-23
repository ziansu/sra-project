@java.lang.Override
public void onClick(android.view.View v) {
    int index = editorCore.getParentView().indexOfChild(layout);
    hideInputHint(index);
    editorCore.getParentView().removeView(layout);
    editorCore.getInputExtensions().setFocusToPrevious(index);
}