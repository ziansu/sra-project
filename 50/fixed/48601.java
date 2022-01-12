@java.lang.Override
public void run() {
    if ((getActivity()) != null)
        getActivity().runOnUiThread(() -> mPresenter.loadTranslation());
    
}