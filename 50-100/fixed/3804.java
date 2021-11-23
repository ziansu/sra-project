public java.util.ArrayList<org.powertac.du.CustomerInfo> getAvailableContractCustomers() {
    java.util.ArrayList<org.powertac.du.CustomerInfo> availableContractCustomers = new java.util.ArrayList<org.powertac.du.CustomerInfo>();
    for (org.powertac.du.CustomerInfo ci : customerRepo.list()) {
        if ((ci != null) && (ci.isCanNegotiate())) {
            availableContractCustomers.add(ci);
        }
    }
    return availableContractCustomers;
}