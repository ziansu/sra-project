@java.lang.Override
public void loop() {
    if (hasReachedTarget()) {
        instructionInProgress = false;
    }
    if ((!(instructionInProgress)) && (it.hasNext())) {
        runInstruction();
    }
}