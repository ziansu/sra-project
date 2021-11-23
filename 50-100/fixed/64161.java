protected java.nio.file.Path getGofmtLocation(com.googlecode.goclipse.tooling.env.GoEnvironment goEnv) throws melnorme.utilbox.core.CommonException {
    if ((GoToolPreferences.GOFMT_Path.getPreference().get()) == null) {
        return com.googlecode.goclipse.ui.editor.actions.GoFmtOperation.getGofmtLocationFromGoRoot(goEnv.getGoRoot_Location()).toPath();
    }
    return GoToolPreferences.GOFMT_Path.getDerivedValue();
}