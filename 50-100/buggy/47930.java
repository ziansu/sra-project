public static valjevac.kresimir.homework3.fragments.PokemonDetailsFragment newInstance(valjevac.kresimir.homework3.models.Pokemon pokemon, boolean isDeviceTablet) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.POKEMON_DETAILS, pokemon);
    if ((valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance) == null) {
        valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance = new valjevac.kresimir.homework3.fragments.PokemonDetailsFragment();
        valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance.setArguments(bundle);
        valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance.isTabletView = isDeviceTablet;
        return valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance;
    }
    valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance.getArguments().putAll(bundle);
    valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance.isTabletView = isDeviceTablet;
    return valjevac.kresimir.homework3.fragments.PokemonDetailsFragment.instance;
}