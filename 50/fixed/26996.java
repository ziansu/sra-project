@org.springframework.web.bind.annotation.RequestMapping(value = "/albums/add", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showAddAlbumForm(org.springframework.ui.Model model) {
    model.addAttribute("album", new local.album.model.Album());
    return "albums/add";
}