private org.wikiup.core.inf.Document getDocument() {
    org.wikiup.core.inf.Document doc = null;
    for (org.wikiup.core.bootstrap.impl.handler.WikiupNamingDirectoryResourceHandler.Directory directory : directories) {
        if (doc == null)
            doc = directory.document;
        else
            if ((isVirtual(doc)) || (!(isVirtual(directory.document))))
                doc = new org.wikiup.core.impl.document.MergedDocument(directory.document, doc);
            else
                doc = new org.wikiup.core.impl.document.MergedDocument(doc, directory.document);
            
        
    }
    return doc;
}