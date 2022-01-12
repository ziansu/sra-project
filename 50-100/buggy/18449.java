private boolean requiresExpansion() {
    for (int i = 0; i < (stackPointers.length); ++i) {
        if ((stackPointers[i]) == (((array.length) / (stackPointers.length)) * i)) {
            return true;
        }
    }
    return false;
}