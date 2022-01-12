@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if ((s.toString().compareTo("")) != 0) {
        imgHintSearch.setVisibility(View.GONE);
    }else {
        imgHintSearch.setVisibility(View.VISIBLE);
    }
    getPresenter().getAdapter().animateTo(getPresenter().filter(s.toString()));
}