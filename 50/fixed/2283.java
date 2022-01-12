@org.springframework.web.bind.annotation.RequestMapping(value = "/api/quote/list")
public edu.cmu.mis.iccfb.model.Quote[] findQuotes(java.lang.String name) {
    return quoteService.findAuthorQuotes(name);
}