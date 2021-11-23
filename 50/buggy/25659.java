private void nextMode() {
    int next = ((movePhaseControlModes.indexOf(currentMovePhaseControlMode)) + 1) % (movePhaseControlModes.size());
    currentMovePhaseControlMode = movePhaseControlModes.get(next);
    currentMovePhaseControlMode.resetCurrentMPCInstructionState();
}