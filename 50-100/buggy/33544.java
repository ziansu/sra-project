public nu.xom.Element getElementByID(java.lang.String ID) {
    nu.xom.Element res = getPhaseByID(ID);
    if (res == null) {
        for (net.sf.memoranda.Phase ph : phases) {
            nu.xom.Element temp = ph.getSubTask(ID).getContent();
            if (temp != null)
                res = ph.getSubTask(ID).getContent();
            
        }
    }
    return res;
}