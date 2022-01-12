@java.lang.Override
public void run() {
    me.scovel.vigler.core.util.logging.Log logger = new me.scovel.vigler.core.util.logging.Log("Shutdown");
    logger.info("Deleting Temporary Files...");
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(new java.io.File("tmp"));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    logger.info("Saving Authentication Data...");
    me.scovel.vigler.core.auth.AuthUtil.save();
    me.scovel.vigler.core.gui.Gui.exit();
}