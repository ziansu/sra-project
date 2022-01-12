public void initState() {
    android.content.SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    int defaultValue = State.NEW.getState();
    state = state.newState(sharedPref.getInt(this.getString(R.string.STATE), defaultValue));
    editor.putInt(this.getString(R.string.STATE), state.getState());
    editor.commit();
    java.lang.System.out.println(("initSTATE: " + (state)));
}