private java.util.HashMap<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium, java.util.LinkedList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Vormerkkarte>> erzeugeVormerkkartenBestand() {
    java.util.LinkedList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Vormerkkarte> Liste = new java.util.LinkedList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Vormerkkarte>();
    java.util.HashMap<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium, java.util.LinkedList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Vormerkkarte>> result = new java.util.HashMap<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium, java.util.LinkedList<de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Vormerkkarte>>();
    for (de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium : _medienbestand.getMedien()) {
        result.put(medium, Liste);
    }
    return result;
}