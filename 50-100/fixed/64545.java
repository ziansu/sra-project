@org.springframework.web.bind.annotation.RequestMapping(value = "/{noteId}")
public org.springframework.web.servlet.ModelAndView note(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer noteId, org.springframework.web.servlet.ModelAndView mav, @org.springframework.web.bind.annotation.ModelAttribute
com.henry.entity.User user) {
    com.henry.entity.Note note = noteService.selectById(noteId);
    if (note == null) {
        throw new java.lang.NullPointerException();
    }
    if ((!(note.getAuthority())) && (!(user.getId().equals(note.getUser().getId())))) {
        return null;
    }
    mav.addObject("note", note);
    mav.setViewName("note/note");
    return mav;
}