private void setPaymentInstallment() {
    if ((layoutInstallment.getVisibility()) == (android.view.View.VISIBLE)) {
        ((com.midtrans.sdk.uikit.activities.CreditCardFlowActivity) (getActivity())).setInstallment(installmentCurrentPosition);
    }
}