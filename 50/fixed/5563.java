public static int getIntStatusForAcceptedObject(de.tohemi.justparty.datamodel.Accepted status) {
    if (status == null) {
        return 0;
    }
    return status.getValue();
}