public void beginExercise() {
    programStatus = com.example.chris.myapplication.ExerciseActivity.ProgramStatus.EXERCISING;
    stateSub.clear();
    playerStats = new com.example.chris.myapplication.PlayerStats();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            txtOverlay.setHeaderText("Now it is your turn to perform the exercise");
        }
    });
}