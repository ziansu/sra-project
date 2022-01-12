@org.rphdyt.library.controller.RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
@org.springframework.security.access.prepost.PreAuthorize(value = "isAuthenticated()")
public void getImage(@org.rphdyt.library.controller.PathVariable(value = "id")
int id, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    org.rphdyt.library.model.Book book = bookService.getBook(id);
    if ((book.getImageFile()) != null) {
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        response.getOutputStream().write(book.getImageFile());
        response.getOutputStream().close();
    }
}