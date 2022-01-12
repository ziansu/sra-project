public static void bcopy(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
    java.io.InputStreamReader inputstreamreader = new java.io.InputStreamReader(in);
    java.io.BufferedReader bufferreader = new java.io.BufferedReader(inputstreamreader);
    java.io.PrintWriter print = new java.io.PrintWriter(out);
    java.lang.String readline = bufferreader.readLine();
    while (readline != null) {
        print.write(readline);
        readline = bufferreader.readLine();
    } 
    bufferreader.close();
    print.close();
}