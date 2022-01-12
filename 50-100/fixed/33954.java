void createEditText() {
    SaveData.editTextList.add(editText);
    editText.setLayoutParams(editParams);
    editText.setTextColor(Color.BLACK);
    editText.setTextSize(17);
    editText.setHint("Comments");
    editText.setHintTextColor(Color.DKGRAY);
    editText.setPadding(20, 20, 20, 20);
    editText.setBackgroundResource(R.drawable.rounded_white);
    linearLayout.addView(editText);
}