public java.lang.String sendCommand(java.lang.String command) throws java.io.IOException, java.lang.InterruptedException {
    bw.write(command);
    bw.newLine();
    bw.flush();
    return br.readLine();
}