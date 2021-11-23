public void seekBarDuration(int duration) {
    seekBarCallbackDuration = duration;
    com.example.helloworld.MainFragment mainfrag = ((com.example.helloworld.MainFragment) (getSupportFragmentManager().findFragmentById(R.id.Main)));
    mainfrag.pass_duration(duration);
}