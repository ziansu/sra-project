public void run() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : changeMap.entrySet()) {
        android.widget.ToggleButton button;
        if (entry.getKey().matches("link:(.*)")) {
            button = mTagToggleButtonMap.get("link");
        }else {
            button = mTagToggleButtonMap.get(entry.getKey());
        }
        if (button != null) {
            button.setChecked(entry.getValue());
        }
    }
}