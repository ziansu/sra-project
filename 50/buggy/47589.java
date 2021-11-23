public static BeanPlant.the_DJDJ.APP_Chat.net.update.Updater getUpdater() {
    try {
        return new BeanPlant.the_DJDJ.APP_Chat.net.update.Updater();
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(BeanPlant.the_DJDJ.APP_Chat.net.update.Updater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return null;
}