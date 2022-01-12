@org.springframework.web.bind.annotation.RequestMapping(value = "/search")
public java.lang.String seekAudio(@org.springframework.web.bind.annotation.RequestBody
java.lang.String searchText, org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    if ((searchText != null) && ((searchText.length()) > 0)) {
        try {
            java.util.List<com.soundconnect.Beans.Audio> audios = service.searchForAudio(java.net.URLEncoder.encode(searchText, "UTF-8"));
            model.addAttribute("audios", audios);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return "includes/findmusic";
}