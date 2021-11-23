public uk.co.nickthecoder.itchy.Director createDirector(uk.co.nickthecoder.itchy.util.ClassName className) throws javax.script.ScriptException {
    java.lang.System.out.println(("Creating Director from SM " + (this.hashCode())));
    uk.co.nickthecoder.itchy.script.ScriptLanguage language = getLanguage(uk.co.nickthecoder.itchy.script.ScriptManager.getExtension(className.name));
    return language.createDirector(className);
}