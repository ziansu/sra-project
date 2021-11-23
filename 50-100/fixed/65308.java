@java.lang.SuppressWarnings(value = "deprecation")
public void onPhaseChooseClick(android.view.View view) {
    ruler.nexPhase();
    if (ruler.isLastPhase()) {
        ibPhaseChangeRight.setImageDrawable(getResources().getDrawable(R.drawable.phase_twostar));
    }else {
        ibPhaseChangeRight.setImageDrawable(getResources().getDrawable(R.drawable.phase_onestar));
    }
}