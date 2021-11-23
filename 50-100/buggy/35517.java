@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Number> observableValue, java.lang.Number oldScreenWidth, java.lang.Number newScreenWidth) {
    editor.Editor.WINDOW_WIDTH = newScreenWidth.intValue();
    scrollBar.setLayoutX(((editor.Editor.WINDOW_WIDTH) - 20));
    editor.Editor.RenderClass RenderObj = new editor.Editor.RenderClass();
    RenderObj.render(charHeight);
}