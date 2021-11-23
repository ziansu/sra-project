public void write() {
    try (java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream("HighScore/easy.txt")))) {
        for (java.lang.String test : this.test) {
            oos.writeUTF(test);
        }
        oos.flush();
        read();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}