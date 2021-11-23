public void addToRoute(android.view.View view) {
    final be.artoria.belfortapp.app.RouteManager rm = be.artoria.belfortapp.app.RouteManager.getInstance();
    final be.artoria.belfortapp.app.DataManager dm = be.artoria.belfortapp.app.DataManager.getInstance();
    rm.addWayPoint(dm.getPOIbyID(be.artoria.belfortapp.activities.MonumentDetailActivity.id));
    android.widget.Toast.makeText(this, getString(R.string.added_to_route), Toast.LENGTH_SHORT).show();
}