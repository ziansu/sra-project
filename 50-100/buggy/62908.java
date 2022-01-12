@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivity = getActivity();
    if ((mActivity) == null)
        return ;
    
    com.yuralex.poketool.DaoPokemon daoPokemon = new com.yuralex.poketool.DaoPokemon(mActivity);
    mPokemonImages = daoPokemon.getAllPokemon();
    com.omkarmoghe.pokemap.controllers.net.NianticManager nianticManager = com.omkarmoghe.pokemap.controllers.net.NianticManager.getInstance();
    mGo = nianticManager.getPokemonGo();
}