@java.lang.Override
public void onPathSetListener(com.linijumsolutions.gg_sports.controllers.Directions directions, boolean generating) {
    if ((directions.getRoutes().size()) > 0) {
        this.route.addAll(directions.getRoutes().get(0).getPath());
    }
    this.generating = generating;
    if (generating == false) {
        generated = true;
    }
}