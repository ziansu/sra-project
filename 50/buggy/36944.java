public boolean isUmbuchung() {
    if (isSplitBuchung()) {
        return false;
    }
    try {
        return (getAsLong(R.string.column_transfer_ID)) != null;
    } catch (de.aw.database.DBDefinition.ResIDNotFoundException e) {
        return false;
    }
}