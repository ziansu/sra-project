private int localsOffsetToArgOffset(int offset) {
    int localsOffset = 0;
    if (!(staticMethod)) {
        localsOffset++;
    }
    for (int iter = 0; iter < (arguments.size()); iter++) {
        com.codename1.tools.translator.ByteCodeMethodArg arg = arguments.get(iter);
        if (localsOffset == offset) {
            return iter + 1;
        }
        localsOffset++;
        if (arg.isDoubleOrLong()) {
            localsOffset++;
        }
    }
    return offset;
}