private void addToDB() {
    java.util.List<java.lang.String> emptyList = new java.util.ArrayList<java.lang.String>();
    emptyList.add("PSEUDO");
    emptyList.add("PSEUDO");
    java.lang.String packages_str = "";
    for (java.lang.String s : m_list_of_packages)
        packages_str += s;
    
    mSqlDB.addExpertDB(mMedi, packages_str, mEanCodes_str, mSectionIds_str, mSectionTitles_str, mEanCodes_str, "", m_pack_info_str, "P", mCustomerId, emptyList, "");
}