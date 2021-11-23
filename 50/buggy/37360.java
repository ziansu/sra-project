public void grow(android.view.View view) {
    character += factor;
    java.lang.System.out.println("worked");
    android.widget.TextView t = ((android.widget.TextView) (findViewById(R.id.character)));
    t.setText(character);
}