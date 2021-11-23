@org.springframework.web.bind.annotation.RequestMapping(value = "/impcImages/laczimages/{acc}")
public java.lang.String laczImages(@org.springframework.web.bind.annotation.PathVariable
java.lang.String acc, org.springframework.ui.Model model) throws java.io.IOException, java.net.URISyntaxException, org.apache.solr.client.solrj.SolrServerException {
    addGeneSymbolToPage(acc, model);
    boolean overview = false;
    imageService.getLacDataForGene(acc, null, overview, false, model);
    return "laczImages";
}