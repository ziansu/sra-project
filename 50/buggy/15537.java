@org.junit.Test
public void testGetListOfTechsByPerson() {
    java.util.List<com.prolificidea.templates.tsw.services.DTOs.TechnologyDTO> techs = personService.getListOfTechsByPerson(2);
    for (com.prolificidea.templates.tsw.services.DTOs.TechnologyDTO t : techs) {
        java.lang.System.out.println(t.getDescription());
    }
}