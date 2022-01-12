public static void setDefcon(java.lang.String defcon) {
    if (net.whydah.sso.user.types.UserToken.isInEnum(defcon, net.whydah.sso.whydah.DEFCON.class)) {
        net.whydah.sso.user.types.UserToken.defcon = defcon;
    }else {
        net.whydah.sso.user.types.UserToken.defcon = DEFCON.DEFCON5.toString();
    }
}