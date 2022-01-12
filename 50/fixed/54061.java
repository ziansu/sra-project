public void dispText(java.lang.String text, bwapi.Position pos, int nframes) {
    if (nframes > 0)
        _msg.add(new DisplayManager.DisplayMsg(pos, text, null, null, null, null, null, nframes));
    
}