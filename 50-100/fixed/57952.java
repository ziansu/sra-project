@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (se.chalmers.projektgrupplp4.studentlivinggbg.activity.MainSearchActivity.firstTime) {
        se.chalmers.projektgrupplp4.studentlivinggbg.activity.MainSearchActivity.firstTime = false;
        initSearchActivity();
    }
    adapter = new se.chalmers.projektgrupplp4.studentlivinggbg.view.AccommodationRecyclerViewAdapter(se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation.getAccommodations(), se.chalmers.projektgrupplp4.studentlivinggbg.activity.ObjectActivity.class);
    new se.chalmers.projektgrupplp4.studentlivinggbg.view.SearchActivityView(this, adapter);
    new se.chalmers.projektgrupplp4.studentlivinggbg.controller.SearchActivityController(this, adapter, se.chalmers.projektgrupplp4.studentlivinggbg.activity.AdvancedSearchActivity.class);
    adapter.refresh();
    try {
        initializeNavigationListener();
    } catch (java.lang.RuntimeException e) {
        e.printStackTrace();
    }
}