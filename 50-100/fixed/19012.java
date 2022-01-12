@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mainActivityHelper = se.chalmers.projektgrupplp4.studentlivinggbg.MainActivityHelper.getInstance(getApplicationContext());
    mainActivityHelper = se.chalmers.projektgrupplp4.studentlivinggbg.MainActivityHelper.getInstance(getApplicationContext());
    se.chalmers.projektgrupplp4.studentlivinggbg.view.SearchActivityView searchActivityView = new se.chalmers.projektgrupplp4.studentlivinggbg.view.SearchActivityView(this);
    se.chalmers.projektgrupplp4.studentlivinggbg.model.SearchActivityModel searchActivityModel = se.chalmers.projektgrupplp4.studentlivinggbg.model.SearchActivityModel.createInstance(this);
    searchActivityView.initLayoutManager(searchActivityModel);
    new se.chalmers.projektgrupplp4.studentlivinggbg.controller.SearchActivityController(this, searchActivityModel, searchActivityView);
}