public void seekBarStartTime(int startTime) {
    seekBarCallbackStartTime = startTime;
    com.example.helloworld.MainFragment mainfrag = ((com.example.helloworld.MainFragment) (getSupportFragmentManager().findFragmentById(R.id.Main)));
    mainfrag.pass_start_time(startTime);
}