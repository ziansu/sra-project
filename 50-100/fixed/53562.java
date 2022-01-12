public net.sf.memoranda.Task getAllByID(java.lang.String id) {
    net.sf.memoranda.Task res;
    nu.xom.Element e = getElementByID(id);
    java.lang.String phaseName = e.getAttribute("phase").getValue();
    if (phaseName.equals("")) {
        res = getPhase(e.getFirstChildElement("text").getValue());
    }else {
        net.sf.memoranda.Phase ph = getPhase(phaseName);
        net.sf.memoranda.TaskList tl = ph.getTaskList();
        res = new net.sf.memoranda.TaskImpl(e, tl);
    }
    return res;
}