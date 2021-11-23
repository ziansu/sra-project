private static void updatesAndExternalPluginManager() throws java.lang.Exception {
    neembuu.uploader.external.UpdatesAndExternalPluginManager uaepm = new neembuu.uploader.external.UpdatesAndExternalPluginManager(neembuu.uploader.settings.Application.getNeembuuHome(), neembuu.uploader.AppLocation.appLocationProvider(), neembuu.uploader.cmd.Main.sun, neembuu.uploader.cmd.Main.ap, new neembuu.uploader.cmd.UpdateProgressCmdI());
    neembuu.uploader.cmd.Main.amw.uaepm(uaepm);
    neembuu.uploader.utils.PluginUtils.uaepm(uaepm);
    uaepm.initIndex();
    neembuu.uploader.cmd.Main.uaepm(uaepm);
    neembuu.uploader.cmd.Main.pa.checkBoxOperations();
}