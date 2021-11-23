public com.softserve.edu.magento.editCustomer.EditCustomerPage.AccountInformation navToAccountInfo() {
    accountInfo.click();
    if ((this.accountInformationAjax) == null) {
        return this.accountInformationAjax = new com.softserve.edu.magento.editCustomer.EditCustomerPage.AccountInformation();
    }
    return accountInformationAjax;
}