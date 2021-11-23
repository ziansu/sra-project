public boolean writeUserFile(java.util.ArrayList<Recommender.User> o) {
    try {
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream("UserList.ser");
        java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
        out.writeObject(o);
        out.close();
        fileOut.close();
        java.lang.System.out.println("Serialized data is saved in BookList.ser");
    } catch (java.io.IOException i) {
        java.lang.System.out.println("This didnt work");
        i.printStackTrace();
    }
    return true;
}