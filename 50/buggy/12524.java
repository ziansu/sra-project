@org.springframework.web.bind.annotation.RequestMapping(value = "initialLoad.do")
public org.springframework.web.servlet.ModelAndView initalLoad(javax.servlet.http.HttpSession session) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    java.util.List<entities.Artist> allArtists = dao.getAllArtists();
    session.setAttribute("all", allArtists);
    mv.setViewName("index1.jsp");
    return mv;
}