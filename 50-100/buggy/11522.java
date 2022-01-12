public rx.Observable<java.util.List<java.lang.String>> get(java.lang.String query) {
    if (android.text.TextUtils.isEmpty(query)) {
        return rx.Observable.just(new java.util.ArrayList<>());
    }
    return rx.Observable.just(rejasupotaro.mds.data.models.Pokemons.allPokemonNames());
}