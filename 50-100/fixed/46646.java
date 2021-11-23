@java.lang.Override
public void onServiceConnected(final android.content.ComponentName className, final android.os.IBinder service) {
    android.util.Log.i(it.eternitywall.eternitywall.fragments.WalletFragment.TAG, ".onServiceConnected()");
    it.eternitywall.eternitywall.EWApplication ewApplication = ((it.eternitywall.eternitywall.EWApplication) (getActivity().getApplication()));
    walletObservable = ewApplication.getWalletObservable();
    walletObservable.addObserver(updateUI);
    updateUI.update(null, null);
}