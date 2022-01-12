public boolean onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    final org.solovyev.android.checkout.PurchaseFlow flow = purchaseFlows.get(requestCode);
    if (flow != null) {
        try {
            flow.onActivityResult(requestCode, resultCode, data);
        } finally {
            if (oneShotPurchaseFlows.contains(requestCode)) {
                destroyPurchaseFlow(requestCode);
            }
        }
        return true;
    }else {
        org.solovyev.android.checkout.Billing.warning((("Purchase flow doesn't exist for requestCode=" + requestCode) + ". Have you forgotten to create it?"));
        return false;
    }
}