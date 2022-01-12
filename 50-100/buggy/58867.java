@org.springframework.web.bind.annotation.GetMapping(value = "/")
public java.lang.String getHomepage(@org.springframework.web.bind.annotation.CookieValue(value = "steamid", required = false)
java.lang.String steamid, org.springframework.ui.Model model) {
    java.lang.System.out.println(("steasmid: " + steamid));
    com.steamstatistics.data.SteamProfileModel steamProfileModel = null;
    if ((steamid != null) && (!(steamid.isEmpty())))
        steamProfileModel = steamProfileHandler.getProfile(steamid);
    
    model.addAttribute("steamprofile", steamProfileModel);
    return "home";
}