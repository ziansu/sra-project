public void sendFile(java.io.FileInputStream fin, java.io.DataOutputStream out) throws java.lang.Exception {
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = fin.read(buffer)) != (-1)) {
        out.write(buffer, 0, bytesRead);
    } 
    fin.close();
}