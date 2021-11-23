public static org.simiancage.DeathTpPlus.helpers.LoggerDTP getLogger() {
    if ((org.simiancage.DeathTpPlus.helpers.LoggerDTP.instance) == null) {
        java.lang.System.out.print("LoggerDTP is not ready yet!");
    }
    return org.simiancage.DeathTpPlus.helpers.LoggerDTP.instance;
}