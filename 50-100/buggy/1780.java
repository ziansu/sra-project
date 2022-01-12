public android.content.Intent build() {
    android.content.Context context = mApp.getApplicationContext();
    java.util.List<com.firebase.ui.auth.provider.IDPProviderParcel> providerInfo = com.firebase.ui.auth.util.ProviderHelper.getProviderParcels(context, mProviders);
    return com.firebase.ui.auth.ui.ChooseAccountActivity.createIntent(context, new com.firebase.ui.auth.ui.FlowParameters(mApp.getName(), providerInfo, mTheme, mLogo, mTosUrl, mIsSmartLockEnabled));
}