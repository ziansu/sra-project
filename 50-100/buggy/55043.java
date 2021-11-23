public void edit(ComponentManager cm) {
    switch (indexOf(cm)) {
        case 1 :
            Database.EditWallet(cm.wallet);
            break;
        case 2 :
            Database.EditIncome(cm.wallet);
            break;
        case 3 :
            Database.EditExpense(cm.wallet);
            break;
    }
}