@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    view = new view.View(stage);
    sc = new search.Searcher();
    sc.search();
}