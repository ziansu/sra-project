public int effectToPerson(java.lang.String name) {
    int balance = 0;
    for (java.lang.String p : eaters) {
        if (name.equals(p)) {
            balance -= split;
            break;
        }
    }
    if (name.equals(payer))
        balance += (split) * (eaters.length);
    
    return balance;
}