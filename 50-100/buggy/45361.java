@org.springframework.web.bind.annotation.RequestMapping(value = "deletePhoto.do")
public org.springframework.web.servlet.ModelAndView deletePhoto(@org.springframework.web.bind.annotation.RequestParam(value = "artistID")
int artistID, @org.springframework.web.bind.annotation.RequestParam(value = "photo")
int photoID) {
    entities.Artist artist = dao.getArtistById(artistID);
    dao.deletePhoto(artistID, photoID);
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.addObject("removedPhoto", photoID);
    mv.addObject("artist", artist);
    mv.setViewName("editArtist.jsp");
    return mv;
}