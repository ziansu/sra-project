public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (buttonView.isChecked()) {
        int questionIndex = java.lang.Integer.decode(buttonView.getTag().toString());
        int viewId = buttonView.getId();
        for (int id = 0; id < (radioButtonId.length); id++) {
            if (viewId == (radioButtonId[id])) {
                userSelection[questionIndex] = id;
            }
        }
    }
}