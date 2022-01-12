@java.lang.Override
public void run() {
    for (int j = 0; j < (sounds[currentCampus].length); j++) {
        java.lang.System.out.println((((sounds[currentCampus][j].getDuration()) + ",") + (sounds[currentCampus][j].getCurrentPosition())));
        sounds[currentCampus][j].start();
        sounds[currentCampus][j].seekTo(0);
    }
}