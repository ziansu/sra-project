@java.lang.Override
public void loadResults(java.util.ArrayList<com.christian.wallapopsuperhero.data.Comic> results, int totalItems) {
    currentTask = null;
    if (results == null) {
        view.loadErrorView();
    }else {
        comics.addAll(results);
        this.totalItems = totalItems;
        view.loadComics(results);
    }
}