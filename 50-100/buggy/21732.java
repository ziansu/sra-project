@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(refreshLock)) {
        try {
            holeViewModel.setOffset(java.lang.Double.parseDouble(s.toString()));
            offsetEditText.setTextColor(getResources().getColor(android.R.color.black));
            refreshInfo();
        } catch (java.lang.Exception e) {
            offsetEditText.setTextColor(getResources().getColor(android.R.color.holo_red_light));
        }
    }
}