public void delete(ComponentManager cm) {
    switch (indexOf(cm)) {
        case 0 :
            Database.DelWallet(cm.getWallet().getID());
            break;
        case 1 :
            Database.DelIncome(cm.getWallet().getID());
            break;
        case 2 :
            Database.DelExpense(cm.getWallet().getID());
            break;
    }
}