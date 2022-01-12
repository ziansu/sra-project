public void start() {
    this.setVisibility(View.VISIBLE);
    setProgressBarTimer(progressBar);
    taskButton.setOnClickListener(new com.example.eilon.taskstripview.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if (!(clicked)) {
                clicked = true;
                clickTime = new java.util.Date();
            }
            handleTask();
        }
    });
}