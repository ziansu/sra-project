@java.lang.Override
public void handle(long now) {
    if ((t) < span) {
        pane.getChildren().retainAll(inf, target);
        for (ConfusedRockets.Rocket r : swarm.getRocketStore()) {
            r.update(t);
            r.draw(pane);
        }
        (t)++;
    }else {
        swarm.breed(0.01, targetPos);
        inf.setText(java.lang.Integer.toString(g));
        (g)++;
        t = 0;
    }
}