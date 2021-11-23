public static int getIntStatusForAcceptedObject(de.tohemi.justparty.datamodel.Accepted status) {
    if (status == null) {
        return 0;
    }
    switch (status) {
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.ACCEPTED :
            return de.tohemi.justparty.database.tables.GuestlistDBTabelle.ACCEPTED;
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.DECLINED :
            return de.tohemi.justparty.database.tables.GuestlistDBTabelle.DECLINED;
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.NOTSURE :
            return de.tohemi.justparty.database.tables.GuestlistDBTabelle.NOTSURE;
        default :
            return 0;
    }
}