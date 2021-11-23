@java.lang.Override
public void onStart() {
    android.util.Log.i("TimerFragment", "------------------------------------------------------->TimerFragment onStart()");
    super.onStart();
    intent = new android.content.Intent(getActivity(), com.itti7.itimeu.TimerService.class);
    if ((TimerService.mTimerServiceFinished) == true) {
        onFinishUnit();
    }
    mCountTimer = 1;
    com.itti7.itimeu.PrefUtil.save(getContext(), "COUNT", mCountTimer);
    getActivity().bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
}