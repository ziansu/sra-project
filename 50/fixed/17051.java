public int getNextCmd() {
    if (!(cmds.isEmpty())) {
        return cmds.get(0);
    }
    return 0;
}