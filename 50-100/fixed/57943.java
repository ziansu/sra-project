private void createChoices() {
    for (int i = (mEntries.size()) - 1; i >= 0; i--) {
        com.tbd.NetHack.RadioButton button = new com.tbd.NetHack.RadioButton(getContext());
        button.setText(mEntries.get(i));
        button.setTag(mEntryValues.get(i));
        button.setOnCheckedChangeListener(tilesetChecked);
        com.tbd.NetHack.LinearLayout.LayoutParams params = new com.tbd.NetHack.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mRoot.addView(button, 0, params);
    }
}