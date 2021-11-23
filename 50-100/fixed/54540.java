private void fetchNewsItems(java.util.ArrayList<java.lang.String> artistList) {
    for (java.lang.String artist : artistList) {
        finalUrl = getGoogleSearchQuery(artist);
        xmlHandler = new com.example.jareddonohue.artisttracker.HandleXML(finalUrl, artist);
        xmlHandler.fetchXML();
        while (xmlHandler.parsingComplete);
        listItems.add(xmlHandler.getNewsItems().get(0));
    }
}