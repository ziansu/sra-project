private java.util.List<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung> getInstruktFromPhasenId(java.lang.String phasenId) {
    java.util.List<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung> resultList = new java.util.LinkedList<htl_leonding.fiplyteam.fiply.trainingsplan.Uebung>();
    java.lang.String id;
    for (htl_leonding.fiplyteam.fiply.trainingsplan.Uebung element : instruktListe) {
        id = element.getPhasenId();
        if (id.equals(phasenId)) {
            resultList.add(element);
        }
    }
    java.lang.System.out.println(("Übungen insgesamt: " + (instruktListe.size())));
    java.lang.System.out.println(("Übungen in der Phase: " + (resultList.size())));
    return resultList;
}