void fromAnywhereToField(int level) throws java.io.IOException {
    downgradeToLevel(level);
    closeAllToLevel((level - 1));
    if (isLastState(ParserStates.InArray)) {
        closeEntity();
    }
}