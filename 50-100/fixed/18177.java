@org.springframework.web.bind.annotation.RequestMapping(path = "/entry/{title}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView view(@org.springframework.web.bind.annotation.PathVariable
java.lang.String title) {
    java.util.ArrayList<com.jamesonnetworks.blog.domain.entry.Entry> entries = this.getEntries();
    org.springframework.web.servlet.ModelAndView entryModelView = new org.springframework.web.servlet.ModelAndView("entry");
    com.google.gson.Gson gson = new com.google.gson.Gson();
    for (com.jamesonnetworks.blog.domain.entry.Entry entry : entries) {
        if ((com.jamesonnetworks.blog.controllers.EntryController.urlerize(entry.getTitle()).compareTo(com.jamesonnetworks.blog.controllers.EntryController.urlerize(title))) == 0) {
            entryModelView.addObject("entry", gson.toJson(entry));
            return entryModelView;
        }
    }
    return entryModelView;
}