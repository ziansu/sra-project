@java.lang.Override
public void run() {
    android.widget.TextView text = ((android.widget.TextView) (findViewById(R.id.textView1)));
    android.widget.TextView prob = ((android.widget.TextView) (findViewById(R.id.textView2)));
    rot13.musicmagic.Graph graph = ((rot13.musicmagic.Graph) (findViewById(R.id.graph)));
    graph.addSample((probability > 0.7 ? stepsAboveA : 0));
    text.setText(note);
    prob.setText(("" + probability));
}