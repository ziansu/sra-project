@org.springframework.web.bind.annotation.RequestMapping(value = "/books", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getBooks(org.springframework.ui.Model model) {
    java.lang.System.out.println("ALl the books");
    model.addAttribute("book", new edu.mum.cs545.lms.domain.Book());
    model.addAttribute("bookTypes", java.util.Arrays.asList(edu.mum.cs545.lms.domain.BookType.values()));
    model.addAttribute("bookCategories", java.util.Arrays.asList(edu.mum.cs545.lms.domain.BookCategory.values()));
    return "books";
}