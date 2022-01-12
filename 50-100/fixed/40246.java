private void saveSim(java.lang.String name, boolean vo) {
    io.say.action(java.lang.String.format("Saving Simulation File"), vo);
    java.io.File f = new java.io.File((name + ".sim"));
    if (!(f.canWrite())) {
        f = new java.io.File(userDeclarations.simPath, f.getName());
    }
    _sim.saveState(f.toString());
    io.say.ok(vo);
}