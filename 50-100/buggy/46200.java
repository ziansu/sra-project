@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.menu_customer_list_cab_addCustomer)) {
        customersAdapter.insert(new com.passioncreativestudio.myandroidplayground.models.Customer(("Inserted Customer " + (java.lang.Integer.toString(customersAdapter.getCount())))), 0);
        customersAdapter.notifyDataSetChanged();
        return true;
    }
    return super.onOptionsItemSelected(item);
}