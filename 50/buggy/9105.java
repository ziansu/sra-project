public void bankListCache() {
    bankList = bankMapper.getBankList();
    java.lang.System.out.println(bankList);
    for (com.paypal.dealbridge.storage.domain.Bank i : bankList) {
        bankNO.put(i.getBankOfficial(), i.getBankName());
    }
}