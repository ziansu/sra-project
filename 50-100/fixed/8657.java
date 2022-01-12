@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    final VASL.build.module.OBA.Module mod = new VASL.build.module.OBA.Module(this);
    final VASL.build.module.OBA.CreateModule c = new VASL.build.module.OBA.CreateModule(this, getModuleCount(), mod.getState());
    c.execute();
    VASSAL.build.GameModule.getGameModule().sendAndLog(c);
}