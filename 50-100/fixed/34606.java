public boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    final org.solovyev.android.checkout.PurchaseFlow flow = purchaseFlows.get(requestCode);
    if (flow != null) {
        flow.onActivityResult(requestCode, resultCode, data);
        return true;
    }else {
        org.solovyev.android.checkout.Billing.warning((("Purchase flow doesn't exist for requestCode=" + requestCode) + ". Have you forgotten to create it?"));
        return false;
    }
}