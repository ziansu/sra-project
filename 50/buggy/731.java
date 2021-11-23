@java.lang.Override
public void onClick(android.view.View v) {
    new com.pokemongostats.view.dialogs.AddPkmnDialog() {
        @java.lang.Override
        public void onPokemonAdded(final com.pokemongostats.model.bean.Pokemon addedPokemon) {
            mCallback.onPokemonSelected(addedPokemon);
        }
    }.show(getFragmentManager(), com.pokemongostats.view.dialogs.AddTrainerDialog.class.getName());
}