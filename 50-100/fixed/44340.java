@org.junit.Test
public void kannTeilnehmerNurEinmalHinzufuegen() throws java.lang.Exception {
    final de.triology.trioexperts.teilnehmerverwaltung.domain.services.TeilnehmerlisteService teilnehmerenlisteService = new de.triology.trioexperts.teilnehmerverwaltung.domain.services.TeilnehmerlisteService(new de.triology.trioexperts.teilnehmerverwaltung.domain.services.RepositoriesFuerTests());
    de.triology.trioexperts.teilnehmerverwaltung.domain.entity.Teilnehmer teilnehmer = new de.triology.trioexperts.teilnehmerverwaltung.domain.entity.Teilnehmer("Testteilnehmer");
    assertTrue(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
    assertFalse(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
    assertFalse(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
    assertFalse(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
    assertFalse(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
    assertFalse(teilnehmerenlisteService.teilnehmerHinzufuegen("Testteilnehmer"));
}