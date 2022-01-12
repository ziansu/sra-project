public java.util.List<business.LibraryMember> allMembers() {
    dataaccess.DataAccess da = new dataaccess.DataAccessFacade();
    java.util.List<business.LibraryMember> retval = new java.util.ArrayList<business.LibraryMember>();
    retval.addAll(da.readMemberMap().values());
    return retval;
}