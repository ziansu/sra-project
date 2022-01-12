@java.lang.Override
public void onFinish(java.lang.Boolean success) {
    if ((parentFragment.isAdded()) && ((getTitle()) != null)) {
        parentFragment.setPageSaved(success);
        org.wikipedia.util.FeedbackUtil.showMessage(getActivity(), getActivity().getString((success ? R.string.snackbar_saved_page_format : R.string.snackbar_saved_page_missing_images), getTitle()));
    }
}