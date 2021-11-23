@java.lang.Override
public void run() {
    rot13.musicmagic.Graph graph = ((rot13.musicmagic.Graph) (findViewById(R.id.graph)));
    graph.addSample((probability > 0.7 ? stepsAboveA : -1));
    text.setText(note);
    prob.setText(("" + probability));
}