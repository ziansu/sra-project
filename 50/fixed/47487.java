@org.springframework.web.bind.annotation.RequestMapping(value = "/insertBook")
@org.springframework.web.bind.annotation.ResponseBody
public int insertBook(entities.BookEntity book) {
    java.lang.System.out.println(book.getName());
    return appService.insertBook(book);
}