@java.lang.Override
public void onNameChanged(int score, java.lang.String name) {
    com.example.colormemory.data.DatabaseHandler db = com.example.colormemory.data.DatabaseHandler.getInstance(this);
    db.addScore(new com.example.colormemory.data.ScoreObject(name, score));
    getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.overlay_fragment_container)).commit();
    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new com.example.colormemory.fragments.CardsFragment()).commit();
    titleTextView.setText(java.lang.Integer.toString(0));
    showHiScore();
}