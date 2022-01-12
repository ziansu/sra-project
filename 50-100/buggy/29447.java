@org.springframework.web.bind.annotation.RequestMapping(value = "/listAuthors/{pageNo}/{searchText}", method = { org.springframework.web.bind.annotation.RequestMethod.GET , org.springframework.web.bind.annotation.RequestMethod.POST }, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String listAuthors(@org.springframework.web.bind.annotation.PathVariable(value = "pageNo")
java.lang.Integer pageNo, @org.springframework.web.bind.annotation.PathVariable(value = "searchText")
java.lang.String searchText) {
    try {
        if (pageNo == null)
            pageNo = 1;
        
        java.util.List<com.gcit.jdbc.entity.Author> authors = adminService.getAllAuthors(pageNo);
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        return mapper.writeValueAsString(authors);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return "Authors get failed. Reason: " + (e.getMessage());
    }
}