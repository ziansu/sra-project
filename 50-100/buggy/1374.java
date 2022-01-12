public void updateSize(int columns, int rows) {
    com.termux.terminal.JNI.setPtyWindowSize(mTerminalFileDescriptor, rows, columns);
    if ((mEmulator) == null) {
        initializeEmulator(columns, rows);
    }else {
        mEmulator.resize(columns, rows);
    }
}