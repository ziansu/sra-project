private void setStoichiometry() {
    java.lang.String stoichiometry = stoichiometryField.getText().trim();
    java.lang.String oldStoichiometry = getStoichiometry();
    if (((stoichiometry.length()) > 0) && ((oldStoichiometry.compareTo(stoichiometry)) != 0)) {
        reaction.setStoichiometry(stoichiometry);
        updateListModels();
    }
}