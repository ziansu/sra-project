public void showDeutsch(android.widget.TextView textView, android.widget.TextView textView2, boolean latinToGerman) {
    if ((index) > 0) {
        if (latinToGerman) {
            textView2.setText(buecher.get(sequence.get(((index) - 1))).getDeutsch());
        }else {
            textView2.setText(buecher.get(sequence.get(((index) - 1))).getLatein());
        }
    }
}