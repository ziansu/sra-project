public boolean setActiveInstIdx(int instIdx) {
    programming.Program prog = getActiveProg();
    if (((prog != null) && (instIdx >= 0)) && (instIdx <= (prog.getInstructions().size()))) {
        activeInstIdx = instIdx;
        return true;
    }
    return false;
}