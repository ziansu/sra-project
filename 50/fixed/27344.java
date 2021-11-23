@dao.Before
public void createXMLParserObject() {
    xmlParser = new dao.XMLParser();
    dao.MovieListManager listManager = new dao.MovieListManager();
    movieList = listManager.getMovieList();
}