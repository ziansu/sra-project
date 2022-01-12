public void _saveAs(java.lang.String filename, StateMachine sm) {
    java.io.File f = new java.io.File((((p.sketchPath()) + "/data/patches/") + filename));
    _saveAs(f, sm, true);
}