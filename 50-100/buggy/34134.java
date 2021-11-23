public void updateTextViewState(com.company.mbelogorodtsev.trainingapplication.HomeActivity.Label_State state) {
    android.widget.TextView statusText = ((android.widget.TextView) (findViewById(R.id.home_stateLabel)));
    switch (state) {
        case downloading :
            {
                statusText.setText(getString(R.string.downloading_state));
            }
            break;
        case playing :
            {
                statusText.setText(getString(R.string.playing_state));
            }
            break;
        case idle :
        default :
            {
                statusText.setText(getString(R.string.idle_state));
            }
            break;
    }
}