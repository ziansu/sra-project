@java.lang.Override
public boolean onBack() {
    timber.log.Timber.d("fragment back!");
    if (AppConfig.Option.MULTISELECT) {
        this.getCurrentAction(false, MenuItemManager.Item.MULTISELECT);
        AppConfig.Option.MULTISELECT = false;
        com.jfsiot.hsgallery.util.view.MenuItemManager.getInstance().clear().setEnable(MenuItemManager.State.UNSELECTED, MenuItemManager.State.DEFAULT);
        this.selectList.clear();
        return true;
    }else {
        android.view.animation.Animation anim = android.view.animation.AnimationUtils.loadAnimation(getActivity().getBaseContext(), R.anim.slide_right_hide);
        this.sidebar.startAnimation(anim);
        return false;
    }
}