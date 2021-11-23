@org.springframework.web.bind.annotation.RequestMapping(path = "edit.do", method = org.springframework.web.bind.annotation.RequestMethod.GET, params = "add")
public org.springframework.web.servlet.ModelAndView addNote(@org.springframework.web.bind.annotation.RequestParam(value = "newMessage")
java.lang.String messages, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Integer id) {
    notesDAO.editNotes(id, messages);
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.addObject("notes", notesDAO.getAllNotes());
    mv.setViewName(notesJSP);
    return mv;
}