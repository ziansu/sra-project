public static void serialize() {
    try (java.io.FileOutputStream fos = new java.io.FileOutputStream(edu.ipfw.sumfun.Application.reader.returnPath())) {
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
        oos.writeObject(edu.ipfw.sumfun.Application.tpp);
    } catch (java.lang.Exception ex0111111111) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error writing to file! Work not saved!");
    }
}