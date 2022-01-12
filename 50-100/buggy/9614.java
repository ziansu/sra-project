@org.springframework.web.bind.annotation.RequestMapping(value = "/impcImages/laczimages/{acc}/{topLevelMa}")
public java.lang.String laczImages(@org.springframework.web.bind.annotation.PathVariable
java.lang.String acc, @org.springframework.web.bind.annotation.PathVariable
java.lang.String topLevelMa, org.springframework.ui.Model model) throws java.io.IOException, java.net.URISyntaxException, org.apache.solr.client.solrj.SolrServerException {
    java.lang.System.out.println("calling laczImages web page");
    addGeneSymbolToPage(acc, model);
    boolean overview = false;
    imageService.getLacDataForGene(acc, topLevelMa, overview, model);
    return "laczImages";
}