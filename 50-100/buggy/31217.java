public static void main(java.lang.String[] args) throws java.lang.Exception {
    try {
        fileHelper.EntityList.loadEntityList();
    } catch (java.lang.Exception e1) {
    }
    osData.RegsWorker.loadRegs();
    Util.Settings.LoadSettings();
    osData.Properties.getInstance().setUserProperties(osData.RegsWorker.getNames());
    if ((args.length) == 0) {
        new Informator();
        new NewArchiver();
    }else
        new Informator(args);
    
}