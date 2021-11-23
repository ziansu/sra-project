public static void main(java.lang.String[] args) {
    lingua.ui.gtk.main_window.MainWindow w = null;
    try {
        org.gnome.gtk.Gtk.init(args);
    } catch (org.gnome.glib.FatalError err) {
    }
    org.freedesktop.bindings.Internationalization.init("lingua", "/usr/share/locale");
    try {
        w = lingua.ui.gtk.main_window.MainWindow.getInstance();
    } catch (org.gnome.glib.FatalError err) {
        w = lingua.ui.gtk.main_window.MainWindow.getInstance();
    }
    w.showAll();
    lingua.ui.gtk.main_window.widgets.Editor.getInstance().grabFocus();
    org.gnome.gtk.Gtk.main();
}