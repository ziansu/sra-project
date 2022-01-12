public void crawl() {
    while (!(toVisit.isEmpty())) {
        currentURL = toVisit.get(0);
        beenVisit.add(currentURL);
        visitMethodHolder.action(currentURL, toVisit, beenVisit);
        toVisit.remove(currentURL);
    } 
}