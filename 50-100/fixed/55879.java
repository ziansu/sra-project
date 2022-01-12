@org.springframework.web.bind.annotation.RequestMapping(value = "deleteGenre.do")
public org.springframework.web.servlet.ModelAndView deleteGenre(@org.springframework.web.bind.annotation.RequestParam(value = "artistID")
int artistID, @org.springframework.web.bind.annotation.RequestParam(value = "genre")
int genreID) {
    dao.deleteGenre(genreID);
    entities.Artist artist = dao.getArtistById(artistID);
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.addObject("removedGenre", genreID);
    mv.addObject("artist", artist);
    mv.setViewName("editArtist.jsp");
    return mv;
}