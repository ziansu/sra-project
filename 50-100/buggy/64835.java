public void crawl() {
    while (!(toVisit.isEmpty())) {
        currentURL = toVisit.get(0);
        toVisit.remove(currentURL);
        beenVisit.add(currentURL);
        visitMethodHolder.action(currentURL);
    } 
}