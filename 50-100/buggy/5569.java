private void renderGameIcons(boolean bool) {
    btnStart.setVisibility((bool ? android.view.View.VISIBLE : android.view.View.GONE));
    for (android.widget.Button btn : btnSelections) {
        btn.setVisibility((bool ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
    }
    barCountdown.setVisibility((bool ? android.view.View.VISIBLE : android.view.View.INVISIBLE));
}