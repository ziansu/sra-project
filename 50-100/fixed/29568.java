public se.kth.karamel.cookbook.metadata.CookbookUrls getUrls() throws se.kth.karamel.common.exception.KaramelException {
    se.kth.karamel.cookbook.metadata.CookbookUrls.Builder builder = new se.kth.karamel.cookbook.metadata.CookbookUrls.Builder();
    builder.url(github);
    if ((branch) != null)
        builder.branchOrVersion(branch);
    else
        if ((version) != null)
            builder.branchOrVersion(version);
        
    
    if ((cookbook) != null)
        builder.subCookbookName(cookbook);
    
    se.kth.karamel.cookbook.metadata.CookbookUrls urls = builder.build();
    return urls;
}