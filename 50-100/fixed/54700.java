public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.menuEdit :
            {
                com.example.finalproject.Fragments.AddDessertFragment fragment = new com.example.finalproject.Fragments.AddDessertFragment();
                fragment.setNewDessert(currentDessert);
                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.dishContainer, fragment);
                transaction.commit();
                return true;
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}