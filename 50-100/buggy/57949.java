@org.springframework.web.bind.annotation.RequestMapping(value = "deleteRecording.do")
public org.springframework.web.servlet.ModelAndView deleteRating(@org.springframework.web.bind.annotation.RequestParam(value = "artistID")
int artistID, @org.springframework.web.bind.annotation.RequestParam(value = "recording")
int recordingID) {
    entities.Artist artist = dao.getArtistById(artistID);
    dao.deleteRecording(recordingID);
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.addObject("removedRecording", recordingID);
    mv.addObject("artist", artist);
    mv.setViewName("editArtist.jsp");
    return mv;
}