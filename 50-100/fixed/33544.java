public nu.xom.Element getElementByID(java.lang.String id) {
    nu.xom.Element res = getPhaseByID(id);
    if (res == null) {
        for (net.sf.memoranda.Phase ph : phases) {
            nu.xom.Element temp = ph.getSubTask(id).getContent();
            if (temp != null) {
                res = ph.getSubTask(id).getContent();
            }
        }
    }
    return res;
}