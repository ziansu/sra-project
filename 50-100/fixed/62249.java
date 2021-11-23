public void removeDefect(int p_defect_num) {
    nu.xom.Elements rs = _root.getChildElements("defect");
    for (int i = 0; i < (rs.size()); i++) {
        if (rs.get(i).getAttribute("defect_number").getValue().equals(java.lang.Integer.toString(p_defect_num))) {
            _root.removeChild(rs.get(i));
        }
    }
}