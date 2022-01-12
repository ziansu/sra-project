public void ButtonHander() {
    android.widget.Button nextQ = ((android.widget.Button) (findViewById(R.id.apply_answer)));
    nextQ.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            CheckAnswer();
            curQ = (curQ) + 1;
            cDown.cancel();
            QuestionEngine();
        }
    });
}