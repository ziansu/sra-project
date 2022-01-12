private static void init() {
    java.lang.String uuid = net.minecraft.client.Minecraft.getMinecraft().getSession().getPlayerID();
    net.playmcm.qwertysam.log.QLogger.log(LogType.AUTHUTIL, ("UUID = " + uuid));
    net.playmcm.qwertysam.util.AuthUtil.user = net.playmcm.qwertysam.util.Staff.valueByUUID(uuid);
    net.playmcm.qwertysam.util.AuthUtil.canUse = net.playmcm.qwertysam.util.Staff.isValid(net.playmcm.qwertysam.util.AuthUtil.user);
    net.playmcm.qwertysam.log.QLogger.log(LogType.AUTHUTIL, (net.playmcm.qwertysam.util.AuthUtil.canUse ? ("Authentication successful!... oHonh " + (net.playmcm.qwertysam.util.AuthUtil.user.getName())) + "... c;|" : "Authentication failed."));
    net.playmcm.qwertysam.util.AuthUtil.hasInit = true;
}