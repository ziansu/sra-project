public void beginExercise() {
    programStatus = com.example.chris.myapplication.ExerciseActivity.ProgramStatus.EXERCISING;
    stateSub.clear();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            txtOverlay.setHeaderText("Now it is your turn to perform the exercise");
        }
    });
}