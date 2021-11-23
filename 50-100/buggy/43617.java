@org.junit.Test
public void testGetFileMdAttrList() {
    java.lang.String distrCode = 1000 + "";
    java.util.List<md.mgmt.base.md.MdAttr> mdAttrs = rdbDao.getDirMdAttrList(distrCode);
    if (mdAttrs == null) {
        md.mgmt.dao.RdbDaoTest.logger.error("get File MdAttrs null");
    }else {
        md.mgmt.dao.RdbDaoTest.logger.info(mdAttrs.toString());
    }
}