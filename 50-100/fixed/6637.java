public void nextPage() {
    if ((entryPage) >= (entryWrapperMap.asMap().size()))
        entryPage = (entryWrapperMap.asMap().size()) - 1;
    
    if (((entryPage) != ((entryWrapperMap.asMap().size()) - 1)) && (!(entryWrapperMap.asMap().isEmpty())))
        (entryPage)++;
    
}