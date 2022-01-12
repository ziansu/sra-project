public void save() {
    if (!(file.delete())) {
    }
    try {
        if (!(file.createNewFile())) {
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    try (java.io.ObjectOutputStream output = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file))) {
        output.writeObject(users.toArray(new be.kdg.sokoban.model.User[users.size()]));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}