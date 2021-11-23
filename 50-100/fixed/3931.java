private void doOnTick(int position, android.view.View view, long millisUntilFinished, long countDownInterval) {
    android.widget.TextView textView1 = ((android.widget.TextView) (view.findViewById(android.R.id.text1)));
    textView1.setText(java.lang.String.valueOf(position));
    android.widget.TextView textView2 = ((android.widget.TextView) (view.findViewById(android.R.id.text2)));
    textView2.setText(java.lang.String.valueOf((millisUntilFinished / countDownInterval)));
}