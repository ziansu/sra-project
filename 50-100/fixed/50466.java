private boolean putDistrCodeList(java.lang.String fileCode) {
    java.util.ArrayList<java.lang.Integer> codes = new java.util.ArrayList<java.lang.Integer>();
    codes.add(commonModule.genDistrCode());
    md.mgmt.dao.entity.DistrCodeList distrCodeList = new md.mgmt.dao.entity.DistrCodeList();
    distrCodeList.setCodeList(codes);
    return indexRdbDao.putDistrCodeList(fileCode, distrCodeList);
}