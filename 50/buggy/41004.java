@java.lang.Override
public void onDetach() {
    super.onDetach();
    presenter.onViewDetached();
    view = null;
}