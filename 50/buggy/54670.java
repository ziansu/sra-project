public void openPositionList(java.util.List<java.net.URL> urls) {
    if (!(confirmDiscard()))
        return ;
    
    prepareForNewPositionList();
    openPositionList(urls, slash.navigation.base.NavigationFormats.getReadFormatsPreferredByExtension(slash.common.io.Files.getExtension(urls)));
}