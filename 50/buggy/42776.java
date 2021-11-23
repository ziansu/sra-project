@org.springframework.web.bind.annotation.RequestMapping(path = "notes.do", method = org.springframework.web.bind.annotation.RequestMethod.GET, params = "edit")
public org.springframework.web.servlet.ModelAndView editNote(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Integer id) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    com.skilldistillery.data.Notes note = notesDAO.getNotesById(id);
    mv.addObject("note", note);
    mv.setViewName(editJSP);
    return mv;
}