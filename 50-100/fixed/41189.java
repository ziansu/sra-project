public void createDataBase() throws java.io.IOException {
    boolean dbExist = false;
    if (dbExist) {
    }else {
        this.getReadableDatabase();
        try {
            copyDataBase();
        } catch (java.io.IOException e) {
            throw new java.lang.Error("Error copying database");
        }
    }
}