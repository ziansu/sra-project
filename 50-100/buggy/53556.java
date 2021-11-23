private void instantiate() {
    startButton = ((android.widget.ImageButton) (rootView.findViewById(R.id.button_start_timer)));
    textView = ((android.widget.TextView) (rootView.findViewById(R.id.textView)));
    spinner = ((android.widget.Spinner) (rootView.findViewById(R.id.spinner_timer)));
    progressBar = ((android.widget.ProgressBar) (rootView.findViewById(R.id.progressBar)));
    setCourses();
    setTimerView(((default_StudyTime) / 1000));
}