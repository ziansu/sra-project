public void closeConnection() {
    if (((sqLiteDatabase) != null) && (sqLiteDatabase.isOpen())) {
        this.close();
    }
}