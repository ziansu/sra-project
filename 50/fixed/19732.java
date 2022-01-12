private void closeConnection() {
    for (android.os.AsyncTask current : threadList) {
        if (!(current.isCancelled()))
            current.cancel(true);
        
    }
    s.close();
}