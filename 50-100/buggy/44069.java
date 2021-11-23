private void setDescr(com.ccentre.controller.Wiki wiki, java.lang.String description) {
    com.ccentre.controller.WikiText wikiText;
    if ((wiki.getWikiText()) == null) {
        wikiText = new com.ccentre.controller.WikiText(description);
        wikiTextService.add(wikiText);
        wiki.setWikiText(wikiText);
    }else
        wiki.getWikiText().setDescription(description);
    
}