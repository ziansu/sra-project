@java.lang.Override
public void onFragmentCreated(int fragmentNumber) {
    fragmentsReadyArray[fragmentNumber] = true;
    android.util.Log.e("Fragment ready", ("" + fragmentNumber));
    if (isAllFragmentsCreated())
        notifyFragments();
    
}