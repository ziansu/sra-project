protected void enforceMWVersion(java.lang.String introduced, java.lang.String removed) {
    WikiBot.MediawikiData.VersionNumber myVersion = getMWVersion();
    if (((introduced == null) || ((myVersion.compareTo(introduced)) < 0)) && ((removed == null) || ((myVersion.compareTo(removed)) > 0))) {
        throw new WikiBot.Errors.UnsupportedError((((("The " + (getLanguage())) + " wiki does not support this API command. (command name: ") + (commandName)) + ")"));
    }
}