public void setFragmentVisualizzaPrenotazioni() {
    fragmentManager = getFragmentManager();
    fragmentTransaction = fragmentManager.beginTransaction();
    com.project.is.sportlink.ui.VisualizzaPrenotazioniFragment visualizzaPrenotazioniFragment = new com.project.is.sportlink.ui.VisualizzaPrenotazioniFragment();
    fragmentTransaction.replace(R.id.fragment_container, visualizzaPrenotazioniFragment);
    fragmentTransaction.addToBackStack(null);
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
    }
    fragmentTransaction.commit();
}