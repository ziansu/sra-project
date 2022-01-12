@java.lang.Override
public void onClick(android.view.View v) {
    int index = editorCore.getParentView().indexOfChild(layout);
    editorCore.getParentView().removeView(layout);
    hideInputHint(index);
    editorCore.getInputExtensions().setFocusToPrevious(index);
}