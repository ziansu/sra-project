@java.lang.Override
public int compare(com.frostwire.search.SearchResult o1, com.frostwire.search.SearchResult o2) {
    int x = (o1 instanceof com.frostwire.search.torrent.TorrentSearchResult) ? ((com.frostwire.search.torrent.TorrentSearchResult) (o1)).getSeeds() : 0;
    int y = (o2 instanceof com.frostwire.search.torrent.TorrentSearchResult) ? ((com.frostwire.search.torrent.TorrentSearchResult) (o2)).getSeeds() : 0;
    return x < y ? -1 : x == y ? 0 : 1;
}