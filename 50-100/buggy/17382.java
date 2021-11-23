public static void saveList(java.io.File file, TodoLinkedList list) {
    try {
        try (java.io.ObjectOutputStream output = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file))) {
            for (TheTask e : list) {
                output.writeObject(e.getDate());
                output.writeUTF(e.getName());
            }
        }
    } catch (java.io.IOException ex) {
        return ;
    } catch (java.lang.Exception ex) {
        return ;
    }
}