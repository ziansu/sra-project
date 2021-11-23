public double answerForQ4() {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (findViewById(R.id.chinese_check_box)));
    android.widget.CheckBox checkBox2 = ((android.widget.CheckBox) (findViewById(R.id.pinyin_check_box)));
    android.widget.CheckBox checkBox3 = ((android.widget.CheckBox) (findViewById(R.id.other_two_check_box)));
    if (checkBox.isChecked()) {
        overallScore += 1;
    }
    if (checkBox2.isChecked()) {
        overallScore += 1;
    }
    return overallScore;
}