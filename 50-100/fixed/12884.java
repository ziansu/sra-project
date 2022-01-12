static byte[] readFile(java.io.File file) throws java.io.IOException {
    byte[] buffer = new byte[1024];
    java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
    try {
        while (true) {
            int read = fileInputStream.read(buffer);
            if (read == (-1))
                break;
            
            bytes.write(buffer, 0, read);
        } 
    } finally {
        fileInputStream.close();
    }
    return bytes.toByteArray();
}