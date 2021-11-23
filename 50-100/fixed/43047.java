void updateViews(boolean visibility) {
    com.push.occrp.HomeActivity.isSearchShown = visibility;
    if (visibility) {
        this.mSearchView.setVisibility(View.VISIBLE);
        if ((this.mAboutAction) != null) {
            this.mAboutAction.setVisible(false);
        }
        getSupportActionBar().setLogo(null);
    }else {
        if (null != (editSearch))
            imm.hideSoftInputFromWindow(editSearch.getWindowToken(), 0);
        
        this.mSearchView.setVisibility(View.GONE);
        showDefaultActionBar();
    }
}