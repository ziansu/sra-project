@java.lang.Override
public void visit(java.io.File file) {
    try {
        java.lang.String s;
        s = file.getPath();
        s = s.replace("\\", "/");
        java.lang.System.out.println(("DEBUG >>>> " + s));
        writer.write((s + "\n"));
    } catch (java.io.IOException ex) {
        java.lang.System.out.println("Shit happens");
        java.util.logging.Logger.getLogger(ch.heigvd.res.lab01.impl.Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}