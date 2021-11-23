@java.lang.Override
public void onClick(android.view.View v) {
    if ((fm.getBackStackEntryCount()) > 0) {
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
    gameCharactersSelected.clear();
    editCharactersMode(false);
    toolbar.setNavigationIcon(null);
    materialMenu.setIconState(MaterialMenuDrawable.IconState.BURGER);
}