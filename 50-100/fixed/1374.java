public void updateSize(int columns, int rows) {
    if ((mEmulator) == null) {
        initializeEmulator(columns, rows);
    }else {
        com.termux.terminal.JNI.setPtyWindowSize(mTerminalFileDescriptor, rows, columns);
        mEmulator.resize(columns, rows);
    }
}