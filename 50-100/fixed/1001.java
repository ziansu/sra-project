@java.lang.Override
public void update() {
    if ((lastAction) == (com.zjutkz.app.presenter.MainPresenter.REFRESH)) {
        beauties.results.clear();
        beauties.results.addAll(repository.get().results);
    }else
        if ((lastAction) == (com.zjutkz.app.presenter.MainPresenter.LOAD_MORE)) {
            beauties.results.addAll(repository.get().results);
        }
    
    com.zjutkz.lib.AgeraBus.eventRepositories().post(new com.zjutkz.app.model.eventbus.LoadEvent(lastAction, beauties.results));
}