public org.saiku.olap.dto.SaikuHierarchy getHierarchy(org.saiku.olap.dto.SaikuCube cube, java.lang.String hierarchyName) throws org.saiku.olap.util.exception.SaikuOlapException {
    org.olap4j.metadata.Cube nativeCube = getNativeCube(cube);
    org.olap4j.metadata.Hierarchy h = nativeCube.getHierarchies().get(hierarchyName);
    if (h != null) {
        org.saiku.olap.dto.SaikuHierarchy hierarchy = org.saiku.olap.util.ObjectUtil.convert(h);
        return hierarchy;
    }
    return null;
}