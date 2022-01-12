public void sendYouSmart(android.view.View view) {
    for (int i = 0; i < (Vibes.length); i++) {
        if (!(Vibes[i].isPlaying())) {
            Vibes3[i].start();
            return ;
        }
    }
}