@java.lang.Override
public void onAttach(android.app.Activity context) {
    super.onAttach(context);
    android.app.Activity hostActivity = getActivity();
    if (hostActivity instanceof com.group.mydea.FragmentModificaNota.addedItem) {
        listener = ((com.group.mydea.FragmentModificaNota.addedItem) (hostActivity));
    }else {
    }
}