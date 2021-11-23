@java.lang.Override
public final void invalidateOptionsMenu() {
    if (((lifecycleHandler) != null) && ((lifecycleHandler.getFragmentManager()) != null)) {
        lifecycleHandler.getActivity().invalidateOptionsMenu();
    }
}