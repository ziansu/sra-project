public void sendYouSmart(android.view.View view) {
    for (int i = 0; i < (Vibes3.length); i++) {
        if (!(Vibes3[i].isPlaying())) {
            Vibes3[i].start();
            return ;
        }
    }
}