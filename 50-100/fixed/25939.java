@java.lang.Override
public void onSwipeLeft() {
    setMessage(java.lang.String.format("%02d:%02d", getMinutePicker(), getSecondPicker()));
    parent = ((android.widget.LinearLayout) (getActivity().findViewById(R.id.contenedor)));
    com.example.rafi.watchtimerv2.TimerView timerView = new com.example.rafi.watchtimerv2.TimerView(getActivity(), message, parent);
    com.example.rafi.watchtimerv2.Timer timer = new com.example.rafi.watchtimerv2.Timer(timerView, getActivity());
    dismiss();
}