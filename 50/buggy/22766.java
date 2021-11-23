public void closeConnection() {
    if (sqLiteDatabase.isOpen()) {
        this.close();
    }
}