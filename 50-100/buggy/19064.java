public void CheckFailCount(org.bukkit.entity.Player p) {
    if ((com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaFailCount.get(p)) > 8) {
        for (org.bukkit.entity.Player pOnline : org.bukkit.Bukkit.getOnlinePlayers()) {
            if (pOnline.hasPermission("captcha.getwarning")) {
                pOnline.sendMessage(((((("[Captcha]" + (org.bukkit.ChatColor.RED)) + (p.getName())) + " failed the Captcha [") + (com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaFailCount.get(p))) + " Times]"));
            }
        }
    }
}