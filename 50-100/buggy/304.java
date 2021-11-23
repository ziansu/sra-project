@java.lang.Override
public void loadResults(java.util.ArrayList<com.christian.wallapopsuperhero.data.Comic> results, int totalItems) {
    currentTask = null;
    comics.addAll(results);
    this.totalItems = totalItems;
    if (results == null) {
        view.loadErrorView();
    }else {
        view.loadComics(results);
    }
}