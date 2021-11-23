@java.lang.Override
protected boolean doImport(int resID, java.lang.String key, java.lang.String value) {
    switch (resID) {
        case R.string.column_accountname :
            mImportAccountName = value;
            return false;
        case R.string.column_accounttyp :
            try {
                de.aw.enums.Kontotyp kt = de.aw.enums.ImportHeader.convertImportAccountTyp(value);
                put(R.string.column_accounttyp, kt.name());
            } catch (de.aw.enums.ImportHeader.HeaderNotFoundException e) {
            }
            return true;
        default :
    }
    return false;
}