public void edit(ComponentManager cm) {
    switch (indexOf(cm)) {
        case 0 :
            Database.EditWallet(cm.wallet);
            break;
        case 1 :
            Database.EditIncome(cm.wallet);
            break;
        case 2 :
            Database.EditExpense(cm.wallet);
            break;
    }
}