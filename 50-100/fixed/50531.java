@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    cb1.getEditor().setText(newValue.toUpperCase());
    liste_autocompletion = utils.AutoCompletion.autocomplete("materiel", "nom", newValue.toUpperCase());
    cb1.setItems(liste_autocompletion);
    cb1.hide();
    cb1.show();
}