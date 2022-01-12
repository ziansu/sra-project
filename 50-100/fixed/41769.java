public fr.centralesupelec.cs.wikiare.wikipedia.Category createCategory(org.neo4j.driver.v1.types.Node node) {
    if (node == null)
        return null;
    
    fr.centralesupelec.cs.wikiare.wikipedia.Category category = null;
    org.neo4j.driver.v1.Session session = driver.session();
    if (node.hasLabel("Category")) {
        if (node.hasLabel("Redirect"))
            category = new fr.centralesupelec.cs.wikiare.wikipedia.RedirectCategory(driver, node.id());
        else
            category = new fr.centralesupelec.cs.wikiare.wikipedia.Category(driver, node.id());
        
    }
    session.close();
    return category;
}