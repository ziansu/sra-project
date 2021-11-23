public void execute() {
    readFile();
    training();
    common.DebugMessage.resultPrint();
    writeFile();
}