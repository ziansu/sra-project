public boolean createNewAccount(int accountNumber, java.lang.String name) {
    if ((getAccount(accountNumber)) == null)
        return false;
    else {
        um.edu.mt.cps2002.assignment.part1.Account newAcc = new um.edu.mt.cps2002.assignment.part1.Account(accountNumber);
        newAcc.setAccountName(name);
        database.put(new java.lang.Integer(accountNumber), newAcc);
        return true;
    }
}