private static boolean isLoggedIn(org.bukkit.entity.Player player) {
    if (nz.co.lolnet.james137137.FactionChat.AuthMeAPI.enable) {
        return fr.xephi.authme.api.API.isAuthenticated(player);
    }
    return true;
}