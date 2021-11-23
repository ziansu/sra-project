public org.egov.commons.Bankaccount createBankAccount(java.lang.String glCode) {
    org.egov.commons.Bankaccount bankaccount = new org.egov.commons.Bankaccount();
    bankaccount.setAccountnumber("123456789");
    bankaccount.setAccounttype("NATIONALISED BANKS");
    bankaccount.setIsactive(1);
    bankaccount.setCurrentbalance(java.math.BigDecimal.valueOf(10000));
    bankaccount.setFund(createFund("testFund"));
    bankaccount.setChartofaccounts(createCOA(((this.getRandomNumber(99999999)) + "")));
    bankaccount.setBankbranch(createBankBranch());
    session.saveOrUpdate(bankaccount);
    return bankaccount;
}