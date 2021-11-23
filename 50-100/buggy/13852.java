private void loadMapProperties(java.lang.String mapFile) {
    java.io.File propertiesFile = new java.io.File((mapFile + ".client.props.leola"));
    if (propertiesFile.exists()) {
        try {
            leola.vm.Leola runtime = seventh.shared.Scripting.newSandboxedRuntime();
            runtime.loadStatics(seventh.server.SeventhScriptingCommonLibrary.class);
            runtime.put("game", this);
            runtime.eval(propertiesFile);
        } catch (java.lang.Exception e) {
            seventh.shared.Cons.println(((("*** ERROR -> Loading " + (propertiesFile.getName())) + ":") + e));
        }
    }
}