private java.util.List<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung> getInstruktFromPhasenId(java.lang.String phasenId) {
    java.util.List<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung> resultList = new java.util.LinkedList<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung>();
    java.lang.String id;
    for (htl_leonding.fiplyteam.fiply.trainingsplan.Uebung element : instruktListe) {
        id = element.getPhasenId();
        if (id.equals(phasenId)) {
            resultList.add(element);
        }
    }
    return resultList;
}