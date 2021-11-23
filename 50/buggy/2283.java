@org.springframework.web.bind.annotation.RequestMapping(value = "/api/quote/list")
public java.util.ArrayList<edu.cmu.mis.iccfb.model.Quote> findQuotes(@org.springframework.web.bind.annotation.RequestBody
java.lang.String name) {
    return quoteService.findAuthorQuotes(name);
}