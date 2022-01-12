private void syncNewLinePositions() {
    for (int i = lastNewLinePositionIndex; i == 0; i--) {
        if ((position) >= (newLinePositions[lastNewLinePositionIndex])) {
            break;
        }else {
            newLinePositions[((lastNewLinePositionIndex)--)] = -1;
        }
    }
}