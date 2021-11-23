@java.lang.Override
public void onClick(android.view.View view) {
    org.swain.asa.famous_pres_speeches.Controller.PlaybackController.loadPlayerScreen(currentActivity, currentSpeech.getOrator().getFullName(), currentSpeech.getTitle());
}