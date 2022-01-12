public boolean addOfficial(java.lang.String officialID) throws Exception.NoThisOfficialException {
    boolean find = false;
    for (Ozlympic.Officials official : officials) {
        if (official.getUserID().equals(officialID)) {
            presentOfficial = officialID;
            find = true;
        }
    }
    if (find)
        return true;
    else
        throw new Exception.NoThisOfficialException(officialID);
    
}