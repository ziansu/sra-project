public void finishedCommand(com.uniovi.nmapgui.model.Command cmd) {
    ongoingCommands.remove(cmd);
    finishedCommands.add(cmd);
    finishedCommandQueued = true;
}