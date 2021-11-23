public void actionPerformed(java.awt.event.ActionEvent evt) {
    VASL.build.module.OBA.Module mod = new VASL.build.module.OBA.Module(this);
    VASL.build.module.OBA.CreateModule c = new VASL.build.module.OBA.CreateModule(this, this.getModuleCount(), mod.getState());
    c.execute();
    VASSAL.build.GameModule.getGameModule().sendAndLog(c);
}