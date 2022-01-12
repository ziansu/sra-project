@org.springframework.web.bind.annotation.RequestMapping(value = "/delete/{id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String delete(@cz.fi.muni.pa165.presentation.layer.mvc.controllers.PathVariable
long id, org.springframework.ui.Model model, org.springframework.web.util.UriComponentsBuilder uriBuilder, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    cz.fi.muni.pa165.api.layer.dto.SongDTO foundSong = songFacade.findSongByID(id);
    if (foundSong != null) {
        songFacade.deleteSong(id);
        redirectAttributes.addFlashAttribute("alert_success", (("Song with title: " + (foundSong.getTitle())) + " was deleted."));
        return "redirect:" + (uriBuilder.path("/song/listAsAdmin").toUriString());
    }
    return "redirect:" + (uriBuilder.path("/song/listAsAdmin").toUriString());
}