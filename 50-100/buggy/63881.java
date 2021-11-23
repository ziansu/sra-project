public static boolean checkAuthLibLoaded() {
    try {
        com.atlauncher.App.class.forName("com.mojang.authlib.exceptions.AuthenticationException");
        com.atlauncher.App.class.forName("com.mojang.authlib.Agent");
        com.atlauncher.App.class.forName("com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService");
        com.atlauncher.App.class.forName("com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication");
    } catch (java.lang.ClassNotFoundException e) {
        com.atlauncher.managers.LogManager.logStackTrace(e);
        return false;
    }
    return true;
}