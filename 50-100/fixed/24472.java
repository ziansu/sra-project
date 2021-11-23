@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String tag = group.g203.countables.path.detail.view.TimeLogFragment.TAG;
    android.support.v4.app.FragmentManager fm = ((group.g203.countables.path.detail.view.DetailActivity) (mDetailView)).getSupportFragmentManager();
    group.g203.countables.path.detail.view.TimeLogFragment fragment = ((group.g203.countables.path.detail.view.TimeLogFragment) (fm.findFragmentByTag(tag)));
    if (fragment != null) {
        fragment.getPresenter().removeLoggedDate(((java.util.Date) (imageView.getTag())));
    }else {
        group.g203.countables.base.utils.DisplayUtils.displayToast(mContext, mContext.getString(R.string.countable_edit_error), Toast.LENGTH_SHORT);
    }
}