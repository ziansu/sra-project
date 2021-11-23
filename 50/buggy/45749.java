@org.springframework.web.bind.annotation.RequestMapping(value = "/advanceSearch", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String advanceSearch(@org.springframework.web.bind.annotation.RequestParam(value = "searchString")
java.lang.String queryString) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println("advanceSearch");
    java.lang.String filePath = this.webServices.queryHadoop(queryString);
    java.lang.String result = this.webServices.convertToJSON(filePath);
    return result;
}