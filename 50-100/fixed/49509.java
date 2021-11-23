private boolean testUnspec(java.util.List<eea.eprtr.model.Wastetransfer> elements, eea.eprtr.model.Wastetransfer testelement) {
    for (eea.eprtr.model.Wastetransfer obj : elements) {
        if (((obj.getIaActivityCode().equals(testelement.getIaActivityCode())) && ((obj.getIaSubActivityCode()) != null)) && (!(obj.getIaSubActivityCode().equals("")))) {
            return true;
        }
    }
    return false;
}