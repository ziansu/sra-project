public void navToAccountInfo() {
    accountInfo.click();
    if ((this.accountInformationAjax) == null) {
        this.accountInformationAjax = new com.softserve.edu.magento.editCustomer.EditCustomerPage.AccountInformation();
    }
}