@java.lang.Override
public void onClick(android.view.View v) {
    if ((!(isReading)) && (isPaused)) {
        if ((savedPosition) > 0) {
            savedPosition -= 1;
            textView.setText(words[savedPosition]);
            progress.setText(calculateProgress(savedPosition, words.length));
        }
    }
}