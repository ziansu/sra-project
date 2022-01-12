@java.lang.Override
public void doEvent(android.app.Activity activity) {
    net.anei.cadpage.donation.DonationManager.instance().refreshStatus(activity);
}