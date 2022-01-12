private void buildDefectList(nu.xom.Element parent) {
    nu.xom.Elements defects = parent.getChildElements("defect");
    for (int i = 0; i < (defects.size()); i++) {
        nu.xom.Element defect = defects.get(i);
        defectList.add(new net.sf.memoranda.DefectImpl(defect, this));
        buildDefectList(defect);
    }
}