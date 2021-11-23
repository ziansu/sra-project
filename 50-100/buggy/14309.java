@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add :
            if ((checkIfFragmentExists(valjevac.kresimir.homework3.activities.PokemonListActivity.POKEMON_DETAILS_FRAGMENT_TAG)) && (isDeviceTablet)) {
                removeFragmentFromStack(valjevac.kresimir.homework3.activities.PokemonListActivity.POKEMON_DETAILS_FRAGMENT_TAG);
            }
            loadFragment(valjevac.kresimir.homework3.fragments.AddPokemonFragment.newInstance(isDeviceTablet), valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG);
            return true;
        default :
            return false;
    }
}