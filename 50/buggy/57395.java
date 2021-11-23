@java.lang.Override
public void onDetach() {
    super.onDetach();
    listener = null;
    com.btwiz.library.BTWiz.cleanup(getActivity());
}