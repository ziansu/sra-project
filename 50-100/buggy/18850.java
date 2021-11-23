@java.lang.Override
public int getItemViewType(int position) {
    if (position < (accountsWithoutCurrent.size())) {
        return de.geeksfactory.opacclient.frontend.DrawerAccountsAdapter.TYPE_ACCOUNT;
    }else
        if (position == (accountsWithoutCurrent.size())) {
            return de.geeksfactory.opacclient.frontend.DrawerAccountsAdapter.TYPE_SEPARATOR;
        }else {
            return de.geeksfactory.opacclient.frontend.DrawerAccountsAdapter.TYPE_FOOTER;
        }
    
}