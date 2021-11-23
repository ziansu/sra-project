public boolean isSameAsPrevious(goController.Stone[][] currentState) {
    for (goController.Stone[][] state : states) {
        if (!(java.util.Arrays.deepEquals(currentState, state))) {
            return true;
        }
    }
    return false;
}