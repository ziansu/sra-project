private boolean requiresExpansion() {
    for (int i = 0; i < (stackPointers.length); ++i) {
        if ((stackPointers[i]) == (((array.length) / (stackPointers.length)) * (i + 1))) {
            return true;
        }
    }
    return false;
}