public static de.tohemi.justparty.datamodel.Accepted getAcceptedObjectForStatus(int status) {
    switch (status) {
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.ACCEPTED :
            return de.tohemi.justparty.datamodel.Accepted.ACCEPTED;
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.DECLINED :
            return de.tohemi.justparty.datamodel.Accepted.DECLINED;
        case de.tohemi.justparty.database.tables.GuestlistDBTabelle.NOTSURE :
            return de.tohemi.justparty.datamodel.Accepted.NOTSURE;
    }
    return null;
}