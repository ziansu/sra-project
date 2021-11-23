private boolean getPistas() {
    searchPresenter.getPistas(null, null, null);
    spinner.setVisibility(View.VISIBLE);
    return true;
}