private void onExternalPaymentProcessed(com.yandex.money.api.methods.ProcessExternalPayment pep) {
    switch (pep.status) {
        case SUCCESS :
            android.app.Fragment fragment = getCurrentFragment();
            if (fragment instanceof ru.yandex.money.android.fragments.SuccessFragment) {
                ((ru.yandex.money.android.fragments.SuccessFragment) (fragment)).saveCard(pep.moneySource);
            }else {
                showSuccess(pep.moneySource);
            }
            break;
        case EXT_AUTH_REQUIRED :
            showWeb(pep.acsUri, pep.acsParams);
            break;
        default :
            showError(pep.error, pep.status.code);
    }
}