public boolean create(java.lang.String fullName, java.lang.String shortName) throws ru.yelton.android.Core.Units.IncorrectFullName, ru.yelton.android.Core.Units.IncorrectShortName {
    if (!(checkNames(fullName, shortName))) {
        return false;
    }
    ru.yelton.android.Core.Units.db.execSQL((((((((("insert into units (_id, client_id, full_name, short_name) " + "select ifnull(max(_id)+1, 1), '") + (mClientID)) + "','") + fullName) + "','") + shortName) + "' ") + "from units"));
    return true;
}