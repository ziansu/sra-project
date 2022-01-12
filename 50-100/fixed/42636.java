@java.lang.Override
public boolean save() {
    boolean success = false;
    if ((animation.getFile()) == null) {
        java.io.File file = net.rpgtoolkit.editor.ui.MainWindow.getInstance().saveByType(net.rpgtoolkit.common.assets.Animation.class);
        if (file != null) {
            success = animation.saveAs(file);
            setTitle(("Editing - " + (file.getName())));
        }
    }else {
        success = animation.save();
    }
    return success;
}