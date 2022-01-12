private boolean isDuplicateInCurrCategory(java.util.HashSet<com.transformuk.bdt.domain.CrawledContent> currContentSet, com.transformuk.bdt.domain.CrawledContent newContent) {
    boolean isDuplicate = false;
    java.util.Iterator<com.transformuk.bdt.domain.CrawledContent> iterator = currContentSet.iterator();
    while (iterator.hasNext()) {
        com.transformuk.bdt.domain.CrawledContent existingContent = iterator.next();
        if (((newContent.getTitle()) != null) && (existingContent.getTitle().equals(newContent.getTitle()))) {
            isDuplicate = true;
            break;
        }
    } 
    return isDuplicate;
}