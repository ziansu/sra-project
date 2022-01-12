public void run() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : changeMap.entrySet()) {
        android.widget.ToggleButton button = mTagToggleButtonMap.get(entry.getKey());
        if (button != null) {
            button.setChecked(entry.getValue());
        }
    }
}