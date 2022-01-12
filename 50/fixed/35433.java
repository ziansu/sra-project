@java.lang.Override
public int getItemCount() {
    return ((accountsWithoutCurrent.size()) + ((accountsWithoutCurrent.size()) > 0 ? 1 : 0)) + (de.geeksfactory.opacclient.frontend.DrawerAccountsAdapter.FOOTER_COUNT);
}