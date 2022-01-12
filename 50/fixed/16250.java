private void startFragmetCategoria() {
    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, pt.ipp.estg.cmu.ui.CategoriaFragment.newInstance(isAdmin)).commit();
}