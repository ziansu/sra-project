@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent propertyChangeEvent) {
    if (propertyChangeEvent.getPropertyName().equals("MatchList")) {
        android.util.Log.d("Yellow", "wallah");
        this.hasMatches = true;
        adapter.setHasMatches(true);
    }
}