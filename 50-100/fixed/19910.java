public void initState() {
    android.content.SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
    int defaultValue = State.NEW.getState();
    state = state.newState(sharedPref.getInt(this.getString(R.string.STATE), defaultValue));
    java.lang.System.out.println(("initSTATE: " + (state)));
}