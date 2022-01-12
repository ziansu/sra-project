@greenapp.controller.RequestMapping(value = "api/playlist/sound/remove", method = RequestMethod.POST, produces = { "application/json" })
@greenapp.controller.ResponseBody
public java.lang.String removeSound(@greenapp.controller.RequestParam(value = "id_sound")
java.lang.String idSound, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    long id = ((long) (request.getSession().getAttribute("id_playlist")));
    greenapp.model.sound.Playlist playlist = playListService.getPlaylistById(id);
    greenapp.model.sound.Audio audio = playlist.getAudioById(java.lang.Long.parseLong(idSound));
    playListService.removeSongFromPlaylist(playlist, audio);
    return "{ \"response\":\"" + ("good" + "\"}");
}