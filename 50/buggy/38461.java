protected void onCryptoOperationError(S result) {
    result.createNotify(org.sufficientlysecure.keychain.ui.base.CryptoOperationFragment.getActivity()).show(this);
}