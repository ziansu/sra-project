private void readTuples(java.io.BufferedInputStream fs) throws java.io.IOException {
    for (int i = 0; i < (T); i++) {
        byte[] tuple = new byte[4];
        int bytesRead = fs.read(tuple);
        if (bytesRead == 4) {
            tuples.add(tuple);
        }else {
            java.lang.System.out.println("Premature end of file");
            break;
        }
    }
}