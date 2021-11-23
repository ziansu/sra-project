private boolean updateDistrCodeListWithNewCode(md.mgmt.dao.entity.DirMdIndex parentDir, java.lang.String parentPath, long newCode) {
    java.lang.String key = "";
    if (parentPath.equals("/")) {
        key = md.mgmt.utils.MdUtils.genMdIndexKey("-1", "/");
    }else {
        key = getParentDirKey(parentPath);
    }
    java.util.List<java.lang.Long> distrCodeList = parentDir.getDistrCodeList();
    distrCodeList.add(newCode);
    parentDir.setDistrCodeList(distrCodeList);
    createRdbDao.removeFileMdIndex(key);
    return createRdbDao.putNewDirIndex(key, parentDir);
}