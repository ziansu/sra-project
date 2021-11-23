public java.lang.String sendCommand(java.lang.String command) throws java.io.IOException {
    bw.write(command.trim());
    bw.newLine();
    bw.flush();
    return br.readLine().trim();
}