@java.lang.Override
public void onDestroyView() {
    if (((getDialog()) != null) && (getRetainInstance()))
        getDialog().setDismissMessage(null);
    
    super.onDestroyView();
}