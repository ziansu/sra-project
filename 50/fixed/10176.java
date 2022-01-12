public void closeConnection() {
    if ((mongo) != null) {
        mongo.close();
    }
}