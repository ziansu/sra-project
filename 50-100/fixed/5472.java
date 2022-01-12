public void deserialize() {
    try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream("users.ser");
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
        users = ((components.Users) (in.readObject()));
        in.close();
        fileIn.close();
    } catch (java.io.IOException i) {
        i.printStackTrace();
        return ;
    } catch (java.lang.ClassNotFoundException c) {
        java.lang.System.out.println("UserObs class not found");
        c.printStackTrace();
        return ;
    }
}