private int getRadioButtonResult(android.widget.RadioButton rightAnswer) {
    if (rightAnswer.isChecked()) {
        return 2;
    }else {
        return 0;
    }
}