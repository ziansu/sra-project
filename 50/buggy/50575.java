@butterknife.OnClick(value = R.id.icon_toolbar_back)
public void onBackClick() {
    if ((toolbarBackIcon.getVisibility()) == (android.view.View.GONE))
        return ;
    
    onBackPressed();
}