public void update() {
    issueInstruction();
    startNewExec();
    execute();
    writeBack();
    display();
    java.lang.System.out.println("update finished");
}