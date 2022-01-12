@org.springframework.web.bind.annotation.RequestMapping(value = "/editAuthor", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String editAuthor(@org.springframework.web.bind.annotation.RequestBody
com.gcit.jdbc.entity.Author author, java.util.Locale locale, org.springframework.ui.Model model) {
    try {
        adminService.updateAuthor(author);
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString("Edit Author successfully");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Authors delete failed. Reason: " + (e.getMessage());
    }
}