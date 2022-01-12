public nu.xom.Element getTaskElementByID(java.lang.String id) {
    nu.xom.Elements els = phaseElement.getChildElements("task");
    nu.xom.Element res = null;
    for (int i = 0; i < (els.size()); i++) {
        nu.xom.Element temp = els.get(i);
        if (temp.getAttributeValue("id").equals(id)) {
            res = temp;
        }
    }
    return res;
}