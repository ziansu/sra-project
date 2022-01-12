private void setPaymentInstallment() {
    if (((layoutInstallment.getVisibility()) == (android.view.View.VISIBLE)) && ((installmentCurrentPosition) > 0)) {
        ((com.midtrans.sdk.uikit.activities.CreditCardFlowActivity) (getActivity())).setInstallment(installmentCurrentPosition);
    }
}