@java.lang.Override
public void run() {
    oldRiddle.remove();
    answerField.setDisabled(false);
    if ((currentRiddleCount) == (riddlesInRoom)) {
        roomCompleted();
    }
}