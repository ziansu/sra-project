@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    se.chalmers.projektgrupplp4.studentlivinggbg.controller.searchwatcher.SearchWatcherController controller = new se.chalmers.projektgrupplp4.studentlivinggbg.controller.searchwatcher.SearchWatcherController(this, se.chalmers.projektgrupplp4.studentlivinggbg.activity.MainSearchActivity.class);
    se.chalmers.projektgrupplp4.studentlivinggbg.view.searchwatcher.SearchWatcherAdapter adapter = new se.chalmers.projektgrupplp4.studentlivinggbg.view.searchwatcher.SearchWatcherAdapter(getApplicationContext(), se.chalmers.projektgrupplp4.studentlivinggbg.model.searchwatcher.SearchWatcherModel.getSearchWatcherItems(), controller);
    controller.setAdapter(adapter);
    controller.update(null);
    new se.chalmers.projektgrupplp4.studentlivinggbg.view.searchwatcher.SearchWatcherView(this, adapter);
    initializeNavigationListener();
}