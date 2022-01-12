private jamlib.JamLastRead freadjamlastread(java.nio.channels.FileChannel f) {
    java.nio.ByteBuffer bb = java.nio.ByteBuffer.allocate(jamlib.Jam.SIZE_JAMLASTREAD);
    jamlib.JamLastRead jlr = new jamlib.JamLastRead();
    try {
        f.read(bb);
    } catch (java.io.IOException ex) {
        return null;
    }
    jlr.UserCRC = jamgetulong(bb, jamlib.Jam.JAMLASTREAD_USERCRC);
    jlr.UserID = jamgetulong(bb, jamlib.Jam.JAMLASTREAD_USERID);
    jlr.LastReadMsg = jamgetulong(bb, jamlib.Jam.JAMLASTREAD_LASTREADMSG);
    jlr.HighReadMsg = jamgetulong(bb, jamlib.Jam.JAMLASTREAD_HIGHREADMSG);
    return jlr;
}