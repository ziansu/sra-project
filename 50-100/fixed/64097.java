@org.junit.Test
public void testAddScore() {
    com.prolificidea.templates.tsw.services.DTOs.PersonDTO p = personService.findPerson(2);
    com.prolificidea.templates.tsw.services.DTOs.EntryDTO e = entryService.findEntry(102);
    java.lang.System.out.println((((p.getFirstName()) + ": ") + (p.getScore())));
    java.lang.System.out.println("Adding score.......");
    scoreService.addScore(e);
    java.lang.System.out.println(("New score: " + (personService.findPerson(2).getScore())));
}