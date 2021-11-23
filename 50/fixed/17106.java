@java.lang.Override
public void onPause() {
    super.onPause();
    trinityconnect.android.bignerdranch.com.trinityconnect.EventLab.get(getActivity()).updateEvent();
}