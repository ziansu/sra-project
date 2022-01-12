private boolean putFileMdIndex(md.mgmt.dao.entity.DirMdIndex parentDir, md.mgmt.base.md.MdIndex mdIndex, java.lang.String fileCode, boolean isDir) {
    java.lang.String parentFileCode = parentDir.getMdIndex().getFileCode();
    java.lang.String key = com.alibaba.fastjson.JSON.toJSONString(new md.mgmt.dao.entity.MdIndexKey(parentFileCode, mdIndex.getName()));
    return indexRdbDao.putFileMdIndex(key, new md.mgmt.dao.entity.FileMdIndex(fileCode, isDir));
}