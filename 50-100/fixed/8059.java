private void showWarning() {
    if (((toastWidget) == null) && ((getContext()) != null)) {
        toastWidget = new bei.m3c.widgets.ToastWidget(getContext(), getContext().getString(R.string.tv_warning), getActivity().findViewById(android.R.id.content));
    }
    if ((toastWidget) != null) {
        toastWidget.flash();
    }
}