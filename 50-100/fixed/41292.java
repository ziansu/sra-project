@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity search(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
com.musicforall.model.TrackSearch trackSearch, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.BAD_REQUEST);
    }
    final java.util.List<com.musicforall.model.Track> tracks = trackService.getAllLike(trackSearch);
    for (final com.musicforall.model.Track track : tracks) {
        if (!(track.getTags().contains(trackSearch.getTag()))) {
            tracks.remove(track);
        }
    }
    return new org.springframework.http.ResponseEntity<java.util.List<com.musicforall.model.Track>>(tracks, org.springframework.http.HttpStatus.OK);
}