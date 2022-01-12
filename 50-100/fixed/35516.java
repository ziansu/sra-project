public com.bloomcounty.appconfigurations.configexplorer.Customer FindCustomer(java.lang.String strCustomerName) {
    com.bloomcounty.appconfigurations.configexplorer.Customer foundCustomer = null;
    for (com.bloomcounty.appconfigurations.configexplorer.Customer customer : customers) {
        if (customer.getCustomerName().equalsIgnoreCase(strCustomerName)) {
            foundCustomer = customer;
            break;
        }
    }
    if (foundCustomer != null)
        return foundCustomer;
    
    org.neo4j.graphdb.Node customerNode = com.bloomcounty.appconfigurations.configexplorer.App.nodeIndex.get(com.bloomcounty.appconfigurations.configexplorer.App.CUSTOMERNAME_KEY, strCustomerName).getSingle();
    if (customerNode == null)
        return foundCustomer;
    
    foundCustomer = new com.bloomcounty.appconfigurations.configexplorer.Customer(customerNode);
    customers.add(foundCustomer);
    return foundCustomer;
}