@javax.ws.rs.GET
public javax.ws.rs.core.Response crawlAll() {
    java.lang.String output = "Crawl the risk factors of all companies";
    java.lang.String fail_output = "Fail to crawl risk factor for companies";
    edu.cmu.sv.webcrawler.models.Crawler c = new edu.cmu.sv.webcrawler.models.Crawler();
    edu.cmu.sv.webcrawler.models.Symbols ss = new edu.cmu.sv.webcrawler.models.Symbols();
    for (java.lang.String symbol : ss.getSymbols()) {
        if ((c.crawl(symbol)) < 0)
            java.lang.System.out.println(javax.ws.rs.core.Response.status(200).entity((fail_output + symbol)).build());
        
    }
    return javax.ws.rs.core.Response.status(200).entity(output).build();
}