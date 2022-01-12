public void Search() {
    SearchMethods.SearchManager.map.map.setSearchType(searchMethod.toString());
    switch (searchMethod) {
        case AS :
            new SearchMethods.AStar();
        case DFS :
            new SearchMethods.DepthFirstSearch();
        case BFS :
            new SearchMethods.BreadthFirstSearch();
        case GBFS :
            new SearchMethods.GreedyBestFirstSearch();
        case CUS1 :
            new SearchMethods.CustomSearch1();
        case CUS2 :
            new SearchMethods.CustomSearch2();
    }
}