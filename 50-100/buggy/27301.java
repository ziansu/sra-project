@org.springframework.web.bind.annotation.RequestMapping(value = "/addAuthor", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String addAuthor(@org.springframework.web.bind.annotation.RequestBody
com.gcit.jdbc.entity.Author author, java.util.Locale locale, org.springframework.ui.Model model) {
    java.lang.System.out.println("here");
    try {
        adminService.addAuthor(author);
        return "Author added succesfully";
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Author add failed. Reason: " + (e.getMessage());
    }
}