@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observableValue, java.lang.String old_val, java.lang.String new_val) {
    if (new_val.equals(unknown))
        userPokemon.setUserPokemonEgg(null);
    
    uk.org.spangle.view.UserPokemonEgg upe = new uk.org.spangle.view.UserPokemonEgg(userPokemon, new_val.equals(isEgg));
    userPokemon.setUserPokemonEgg(upe);
}