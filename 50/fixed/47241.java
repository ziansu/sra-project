@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    this.currentFragementIndex = savedInstanceState.getInt(CurrentFragementTAG_KEY);
}