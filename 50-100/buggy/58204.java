@java.lang.Override
public void onClick(android.view.View v) {
    if ((!(isReading)) && (isPaused)) {
        if ((savedPosition) < ((words.length) - 1)) {
            savedPosition += 1;
            textView.setText(words[savedPosition]);
            progress.setText(((((((savedPosition) + " of ") + (words.length)) + ": ") + (calculateProgress(savedPosition, words.length))) + "%"));
        }
    }
}