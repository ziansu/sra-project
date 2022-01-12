public void start() {
    setProgressBarTimer(progressBar);
    taskButton.setOnClickListener(new com.example.eilon.taskstripview.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if (!(clicked)) {
                clickTime = new java.util.Date();
            }
            handleTask();
        }
    });
}