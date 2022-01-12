public static boolean checkAuthLibLoaded() {
    try {
        java.lang.Class.forName("com.mojang.authlib.exceptions.AuthenticationException");
        java.lang.Class.forName("com.mojang.authlib.Agent");
        java.lang.Class.forName("com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService");
        java.lang.Class.forName("com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication");
    } catch (java.lang.ClassNotFoundException e) {
        com.atlauncher.managers.LogManager.logStackTrace(e);
        return false;
    }
    return true;
}