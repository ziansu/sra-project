public void moreOptions(model.Ergebnis ergebnis) {
    if (ergebnis != null) {
        setErgebnis(editedResult, ergebnis);
    }else {
        resetResultActionPerformed(editedResult);
    }
    editedResult = -1;
}