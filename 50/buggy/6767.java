java.lang.String nextUrl() {
    java.lang.String nextUrl;
    do {
        nextUrl = this.pagesToVisit.remove(0);
    } while (this.pagesVisited.contains(nextUrl) );
    this.pagesVisited.add(nextUrl);
    return nextUrl;
}