public void hideUserOptions() {
    android.widget.Button raiseButton = ((android.widget.Button) (findViewById(R.id.raise)));
    android.widget.Button foldButton = ((android.widget.Button) (findViewById(R.id.fold)));
    android.widget.Button checkButton = ((android.widget.Button) (findViewById(R.id.check)));
    android.widget.Button callButton = ((android.widget.Button) (findViewById(R.id.call)));
    raiseButton.setVisibility(View.INVISIBLE);
    foldButton.setVisibility(View.INVISIBLE);
    checkButton.setVisibility(View.INVISIBLE);
    callButton.setVisibility(View.INVISIBLE);
}