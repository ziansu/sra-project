public int effectToPerson(java.lang.String name) {
    int balance = 0;
    for (java.lang.String p : eaters) {
        if (name.equals(p)) {
            balance -= ((int) ((amount) / ((float) (eaters.length))));
            break;
        }
    }
    if (name.equals(payer))
        balance += amount;
    
    return balance;
}