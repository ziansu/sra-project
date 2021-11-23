private static uk.co.nickthecoder.jame.Surface loadSurface(java.lang.String filename) throws uk.co.nickthecoder.jame.JameException {
    uk.co.nickthecoder.jame.Surface loaded = new uk.co.nickthecoder.jame.Surface(filename);
    uk.co.nickthecoder.jame.Surface result = loaded.convert();
    loaded.free();
    return result;
}