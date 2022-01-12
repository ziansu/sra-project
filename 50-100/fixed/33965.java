public uk.co.nickthecoder.itchy.script.ScriptLanguage getLanguage(java.lang.String extension) {
    uk.co.nickthecoder.itchy.script.ScriptLanguage result = this.languages.get(extension);
    if (result == null) {
        uk.co.nickthecoder.itchy.script.ScriptLanguageFactory factory = uk.co.nickthecoder.itchy.script.ScriptManager.getRegisteredFactories().get(extension);
        if (factory == null) {
            return null;
        }
        result = factory.create(this);
        this.languages.put(extension, result);
    }
    return result;
}