@org.bukkit.event.EventHandler
public void InventoryClose(org.bukkit.event.inventory.InventoryCloseEvent event) {
    org.bukkit.entity.Player p = ((org.bukkit.entity.Player) (event.getPlayer()));
    if ((event.getInventory().getName()) == (com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaGUITitle)) {
        if (com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaSolved.get(p)) {
            com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaCount.put(p, 0);
        }else {
            com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaFailCount.put(p, ((com.apply55gx.captchaapi.Captcha.CaptchaCore.CaptchaFailCount.get(p)) + 1));
            CheckFailCount(p);
        }
    }
}