@java.lang.Override
public void getPaymentInfo(commonosgi.model.BillingInfo billingInfo) {
    if ((prq) > 0) {
        (prq)--;
        biq.add(billingInfo);
        if ((this.billingInfo) == null)
            createBI();
        
        gui.enable();
    }else
        biq.add(billingInfo);
    
}