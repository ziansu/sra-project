@java.lang.Override
public int compare(java.lang.Object a, java.lang.Object b) {
    java.util.GregorianCalendar date1 = ((BankApplication.Account) (a)).getDateOpened();
    java.util.GregorianCalendar date2 = ((BankApplication.Account) (b)).getDateOpened();
    if (date1.before(date2))
        return -1;
    
    if (date1.after(date2))
        return 1;
    else
        return 0;
    
}