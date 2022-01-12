private void setDescr(com.ccentre.controller.Wiki wiki, java.lang.String description) {
    com.ccentre.controller.WikiText wikiText;
    if ((wiki.getWikiText()) == null) {
        wikiText = new com.ccentre.controller.WikiText(description);
        wiki.setWikiText(wikiText);
    }else {
        wikiText = wiki.getWikiText();
        wikiText.setDescription(description);
    }
    wikiTextService.add(wikiText);
}