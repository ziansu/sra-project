public static uk.co.nickthecoder.itchy.Input find(java.lang.String name) {
    uk.co.nickthecoder.itchy.Input result = uk.co.nickthecoder.itchy.Itchy.getGame().resources.getInput(name);
    if (result == null) {
        java.lang.System.err.println(((("Didn't find Input : " + name) + " in ") + (uk.co.nickthecoder.itchy.Itchy.getGame().resources.getFilename())));
        try {
            throw new java.lang.Exception("Foo");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return new uk.co.nickthecoder.itchy.Input();
    }
    return result;
}