@java.lang.Override
public int compare(com.frostwire.search.SearchResult o1, com.frostwire.search.SearchResult o2) {
    int n1 = (o1 instanceof com.frostwire.search.torrent.TorrentSearchResult) ? ((com.frostwire.search.torrent.TorrentSearchResult) (o1)).getSeeds() : 0;
    int n2 = (o2 instanceof com.frostwire.search.torrent.TorrentSearchResult) ? ((com.frostwire.search.torrent.TorrentSearchResult) (o2)).getSeeds() : 0;
    return java.lang.Integer.compare(n1, n2);
}