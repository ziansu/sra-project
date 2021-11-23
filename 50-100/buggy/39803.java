@java.lang.Override
public void onClick(android.view.View v) {
    int starNum = preferences.getInt("StarScore", 0);
    int diff = starNum - 2;
    stars.setTypeface(myFont);
    stars.setText((diff + " /"));
    android.content.SharedPreferences.Editor editor = preferences.edit();
    editor.putInt("StarScore", diff);
    editor.apply();
}