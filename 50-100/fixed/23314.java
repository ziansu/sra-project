@com.softserve.edu.controller.RequestMapping(value = "/reader", method = RequestMethod.GET)
public java.lang.String ReaderList(org.springframework.ui.Model model) {
    java.util.List<com.softserve.edu.entity.Reader> readers = readerService.findAll();
    model.addAttribute("reader", new com.softserve.edu.entity.Reader());
    model.addAttribute("readerList", readers);
    model.addAttribute("exist", exist);
    model.addAttribute("canDelete", canDeleteReader);
    exist = false;
    canDeleteReader = true;
    return "reader";
}