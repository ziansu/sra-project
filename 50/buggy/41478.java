@java.lang.Override
public void onPromoButtonClick(boolean accepted) {
    super.onPromoButtonClick(accepted);
    mManagementDelegate.logPromoOutcome();
    setIsPromoActive(false);
}