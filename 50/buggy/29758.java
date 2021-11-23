public void dismissDialog() {
    getActivity().startActivityForResult(getActivity().getIntent(), 10);
    dismiss();
}