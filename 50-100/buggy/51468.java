@greenapp.controller.RequestMapping(value = "/{username}/playlist/{playlist}", method = RequestMethod.GET)
public java.lang.String plylist(org.springframework.ui.Model model, @greenapp.controller.PathVariable(value = "playlist")
java.lang.String playlist, @greenapp.controller.PathVariable(value = "username")
java.lang.String username, javax.servlet.http.HttpServletRequest request) {
    request.getSession().setAttribute("id_playlist", java.lang.Integer.parseInt(playlist));
    model.addAttribute("playlist", playlist);
    greenapp.model.sound.Playlist playlists = playListService.getPlaylistById(java.lang.Integer.parseInt(playlist));
    if (playlists == null)
        return "notFound";
    
    model.addAttribute("sound", playlists);
    return "playlist";
}