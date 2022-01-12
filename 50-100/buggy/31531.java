private boolean moveManagementLayoutDown() {
    if (((currentManagementPosition) != (tk.usagis2.ez_vpngate.Activities.DashBoard.MANAGEMENT_POS_SHOW_TOOLS)) || (!(canManagementStart)))
        return false;
    
    android.animation.ObjectAnimator animator = android.animation.ObjectAnimator.ofFloat(connectManagementLayout, "translationY", connectManagementLayout.getY(), startPositionInPx);
    animator.setDuration(tk.usagis2.ez_vpngate.Activities.DashBoard.HIDE_TIME_LONG);
    animator.setInterpolator(new android.support.v4.view.animation.FastOutSlowInInterpolator());
    animator.start();
    currentManagementPosition = tk.usagis2.ez_vpngate.Activities.DashBoard.MANAGEMENT_POS_SHOW_ADS;
    hideClickPreventingLayout(false, R.color.colorTransparentDark, tk.usagis2.ez_vpngate.Activities.DashBoard.HIDE_TIME_LONG);
    return true;
}