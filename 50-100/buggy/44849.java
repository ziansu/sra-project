@java.lang.Override
public void run() {
    switch (knocks) {
        case 1 :
            if (mediaPlayer.isPlaying()) {
                pause();
            }else {
                play();
            }
            java.lang.System.out.println("PLAY");
            break;
        case 2 :
            nextTrack();
            java.lang.System.out.println("NEXT");
            break;
        case 3 :
            java.lang.System.out.println("PREVIOUS");
            previousTrack();
            break;
        case 4 :
            java.lang.System.out.println("STOP");
            stop();
            break;
    }
    knocks = 0;
    lastKnock = 0;
}