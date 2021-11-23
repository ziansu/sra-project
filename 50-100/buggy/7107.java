public boolean removeLine(int index) {
    java.util.List lines = readFromFile();
    try {
        java.nio.file.Files.delete(path);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        return false;
    }
    java.lang.System.out.print((("Linea a eliminar" + index) + " "));
    java.lang.System.out.println(("Linea: " + (lines.get(index))));
    lines.remove(index);
    writeToFile(lines);
    return true;
}