public void Search() {
    SearchMethods.SearchManager.map.map.setSearchType(searchMethod.toString());
    switch (searchMethod) {
        case AS :
            new SearchMethods.AStar();
            break;
        case DFS :
            new SearchMethods.DepthFirstSearch();
            break;
        case BFS :
            new SearchMethods.BreadthFirstSearch();
            break;
        case GBFS :
            new SearchMethods.GreedyBestFirstSearch();
            break;
        case CUS1 :
            new SearchMethods.CustomSearch1();
            break;
        case CUS2 :
            new SearchMethods.CustomSearch2();
            break;
    }
}