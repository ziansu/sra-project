@java.lang.Override
public void setValue(java.io.File value) {
    getEditor().setText((value == null ? null : value.getAbsolutePath()));
}