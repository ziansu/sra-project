private void processPWD() {
    if (!(isConnected)) {
        output.println(returncode.ReturnCode.nonAuth());
        return ;
    }
    output.write(userDir.getAbsolutePath());
    output.write('\n');
    output.flush();
}