public ontario.accounts.Account removeAccount(java.lang.String numAccTemp) {
    if (numAccTemp == null) {
        return null;
    }else {
        boolean temp;
        ontario.accounts.Account temp2;
        for (int i = 0; i < (acc.size()); i++) {
            temp = acc.get(i).getAccountNumber().equals(numAccTemp);
            if (temp == true) {
                temp2 = acc.get(i);
                acc.remove(i);
                return temp2;
            }
        }
    }
    return null;
}