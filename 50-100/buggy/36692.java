public int crawl(java.lang.String symbol, java.lang.String docType) {
    edu.cmu.sv.webcrawler.services.GetRiskFactor g = new edu.cmu.sv.webcrawler.services.GetRiskFactor();
    java.util.List<edu.cmu.sv.webcrawler.services.RequiredInfo> l = g.DownloadByCIKAndType(symbol, false, docType);
    for (edu.cmu.sv.webcrawler.services.RequiredInfo info : l)
        g.save(info);
    
    return 1;
}