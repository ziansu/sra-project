@java.lang.Override
public void visit(java.io.File file) {
    try {
        java.lang.String path = file.getParent();
        path += "\\" + (file.getName());
        writer.write(path);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(ch.heigvd.res.lab01.impl.Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}