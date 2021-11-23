@java.lang.Override
public void onSelectModeChanged(final boolean selectMode) {
    if (selectMode) {
        mActionMode = getActivity().startActionMode(this);
    }else
        if ((mActionMode) != null) {
            mActionMode.finish();
        }
    
}