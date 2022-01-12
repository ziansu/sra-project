public void open(int row, int column) {
    validateRowColumn(row, column);
    Percolation.Site correspondingSite = getSiteFromCoordinates(row, column);
    if (correspondingSite.IsOpen)
        return ;
    
    Percolation.Site[] sitesToConnect = getNeighborSites(row, column);
    for (Percolation.Site site : sitesToConnect) {
        if (shouldConnectSite(site)) {
            _sortingAlgorithm.union(site.Id, correspondingSite.Id);
        }
    }
    correspondingSite.IsOpen = true;
}