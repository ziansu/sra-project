public static de.aw.cash.FragmentBuchungenListe newInstance(java.lang.Long accountID) {
    java.lang.String selection = ((de.aw.cash.FragmentBuchungenListe.tbd.columnName(R.string.column_accountID)) + " = ? AND NOT ") + (de.aw.cash.FragmentBuchungenListe.tbd.columnName(R.string.column_isDetail));
    java.lang.String[] selectionArgs = new java.lang.String[]{ accountID.toString() };
    return de.aw.cash.FragmentBuchungenListe.newInstance(accountID, selection, selectionArgs);
}