@java.lang.Override
public void createBillingInfo() {
    java.lang.System.out.println("BIN createBillingInfo");
    if (queue.isEmpty()) {
        billingInfo = new commonosgi.model.BillingInfo();
        commonosgi.util.NodeBehavior.billingInfoBehavior(billingInfo);
        gui.notify(null, billingInfo);
        gui.enable();
    }else {
        queue.add(new java.lang.Object());
    }
}