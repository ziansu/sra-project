@java.lang.Override
public int compare(java.lang.Object a, java.lang.Object b) {
    java.util.Calendar date1 = ((BankApplication.Account) (a)).getDateOpened();
    java.lang.System.out.print(date1);
    java.util.Calendar date2 = ((BankApplication.Account) (b)).getDateOpened();
    java.lang.System.out.print(date2);
    if (date1.before(date2))
        return -1;
    
    if (date1.after(date2))
        return 1;
    else {
        return 0;
    }
}