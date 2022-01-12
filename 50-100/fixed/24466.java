public static java.util.List<us.dot.its.jpo.ode.j2735.dsrc.BasicSafetyMessage> convert(us.dot.its.jpo.ode.j2735.semi.VehSitDataMessage vsdm) {
    java.util.List<us.dot.its.jpo.ode.j2735.dsrc.BasicSafetyMessage> bsmList = new java.util.ArrayList<>();
    for (us.dot.its.jpo.ode.j2735.semi.VehSitRecord vsr : vsdm.bundle.elements) {
        us.dot.its.jpo.ode.j2735.dsrc.BasicSafetyMessage bsm = new us.dot.its.jpo.ode.j2735.dsrc.BasicSafetyMessage();
        bsm.coreData = us.dot.its.jpo.ode.vsdm.VsdToBsmConverter.createCoreData(vsr);
        bsmList.add(bsm);
    }
    return bsmList;
}