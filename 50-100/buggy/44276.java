@java.lang.Override
public void visit(java.io.File file) {
    try {
        writer.write(((file.getPath().replace('\\', '/')) + "\r\n"));
    } catch (java.io.IOException e) {
        java.util.logging.Logger.getLogger(ch.heigvd.res.lab01.impl.Application.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
    }
}