public byte[] getFileStream() throws java.io.IOException, java.rmi.RemoteException {
    int b = 0;
    do {
        int j = 0;
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        while (((b = bfin.read()) != (-1)) && (j < 100000000)) {
            out.write(b);
            j++;
        } 
        byte[] data = out.toByteArray();
        return data;
    } while (b != (-1) );
}