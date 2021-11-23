protected void enforceMWVersion(java.lang.String introduced, java.lang.String removed) {
    WikiBot.MediawikiData.VersionNumber myVersion = getMWVersion();
    if ((((myVersion.compareTo(introduced)) < 0) || (introduced == null)) && (((myVersion.compareTo(removed)) > 0) || (removed == null))) {
        throw new WikiBot.Errors.UnsupportedError((((("The " + (getLanguage())) + " wiki does not support this API command. (command name: ") + (commandName)) + ")"));
    }
}