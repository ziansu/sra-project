@java.lang.Override
public void run() {
    oldRiddle.remove();
    if ((currentRiddleCount) == (riddlesInRoom)) {
        roomCompleted();
    }
    answerField.setDisabled(false);
}