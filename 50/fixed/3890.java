@java.lang.Override
public boolean istVerliehenAn(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Kunde kunde, de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium) {
    if ((_verleihService.getVerleihkarteFuer(medium)) != null) {
        return kunde.equals(_verleihService.getVerleihkarteFuer(medium).getEntleiher());
    }
    return false;
}