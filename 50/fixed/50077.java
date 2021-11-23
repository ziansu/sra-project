@org.springframework.web.bind.annotation.RequestMapping(value = "/cat/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String booksOfCategory(@org.springframework.web.bind.annotation.PathVariable(value = "id")
int id, org.springframework.ui.Model m) {
    java.util.List<java.lang.String> result = bookListProvider.getBookDataById(id);
    m.addAttribute("books", result);
    return "books";
}