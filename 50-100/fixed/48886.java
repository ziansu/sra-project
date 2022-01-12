private void readDatabase(java.lang.String databasePath) throws java.io.IOException {
    java.io.BufferedReader fileReader = new java.io.BufferedReader(new java.io.FileReader(databasePath));
    try {
        java.lang.String line = fileReader.readLine();
        while (true) {
            line = fileReader.readLine();
            if (line == null)
                break;
            
            ClientData clientData = new ClientData(java.lang.Integer.parseInt(line));
            clientDataMap.put(clientData.getId(), clientData);
        } 
    } finally {
        fileReader.close();
    }
}