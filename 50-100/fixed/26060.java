public static void deserialize() {
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    try (java.io.FileInputStream fis = new java.io.FileInputStream(edu.ipfw.sumfun.Application.reader.returnPath())) {
        java.lang.System.out.println(edu.ipfw.sumfun.Application.reader.returnPath());
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
        edu.ipfw.sumfun.Application.tpp = ((edu.ipfw.sumfun.TopPointPlayers) (ois.readObject()));
    } catch (java.lang.Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error reading file! Loading to default settings!");
        edu.ipfw.sumfun.Application.tpp = new edu.ipfw.sumfun.TopPointPlayers();
    }
}