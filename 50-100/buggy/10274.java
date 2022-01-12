private void updateAdd() {
    for (de.kuschku.libquassel.message.Message message : unfiltered) {
        if (!(filterItem(message))) {
            java.lang.String simpleName = getClass().getSimpleName();
            android.util.Log.e(simpleName, ("Unfiltered: " + message));
            filtered.add(message);
        }
    }
}