public void delete(ComponentManager cm) {
    switch (indexOf(cm)) {
        case 1 :
            Database.DelWallet(cm.getWallet().getID());
            break;
        case 2 :
            Database.DelIncome(cm.getWallet().getID());
            break;
        case 3 :
            Database.DelExpense(cm.getWallet().getID());
            break;
    }
}