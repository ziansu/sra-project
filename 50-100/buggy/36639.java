@greenapp.controller.RequestMapping(value = "api/playlist/sound/remove", method = RequestMethod.POST, produces = { "application/json" })
@greenapp.controller.ResponseBody
public java.lang.String removeSound(@greenapp.controller.RequestParam(value = "id_sound")
java.lang.String idSound, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    int id = ((int) (request.getSession().getAttribute("id_playlist")));
    greenapp.model.sound.Playlist playlist = playListService.getPlaylistById(((java.lang.Integer) (request.getSession().getAttribute("id_playlist"))));
    greenapp.model.sound.Audio audio = playlist.getAudioById(java.lang.Long.parseLong(idSound));
    playListService.removeSongFromPlaylist(playListService.getDefaultPlaylist(), audio);
    return "{ \"response\":\"" + ("good" + "\"}");
}