public static void refreshUI() {
    if ((com.breadwallet.tools.animation.BRAnimator.level) != 1)
        return ;
    
    if ((com.breadwallet.presenter.fragments.FragmentSettingsAll.adapter) != null) {
        com.breadwallet.presenter.fragments.FragmentSettingsAll.adapter.updateData(com.breadwallet.presenter.fragments.FragmentSettingsAll.transactionObjects);
    }
}