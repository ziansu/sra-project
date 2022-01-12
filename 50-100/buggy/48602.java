public void run() throws java.io.FileNotFoundException {
    startElection();
    while (true) {
        try {
            common.Connection connection = acceptor.accept();
            connections.put(connection.getDest(), connection);
            java.lang.Thread t = new java.lang.Thread(connection);
            SendCandidateList(ReadCandidateList());
            t.start();
        } catch (java.io.IOException e) {
            common.Service.logError("Server Connection Error");
        } catch (java.lang.ClassNotFoundException e) {
            e.printStackTrace();
        }
    } 
}