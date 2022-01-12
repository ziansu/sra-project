@java.lang.Override
public final void run() {
    final xyz.algogo.desktop.frames.EditorFrame frame = new xyz.algogo.desktop.frames.EditorFrame();
    frame.setVisible(true);
    if ((args == null) || ((args.length) == 0)) {
        return ;
    }
    final java.io.File file = new java.io.File(args[0]);
    if (file.exists()) {
        try {
            frame.open(file);
        } catch (final java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}