@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    result = new br.com.caelum.vraptor.util.test.MockResult();
    validator = new br.com.caelum.vraptor.util.test.MockValidator();
    controller = new br.com.petshopplus.controller.AgendaController(agendaDao, result, validator, clienteDao, animalDao, funcionarioDao);
    agenda = new br.com.petshopplus.util.model.AgendaBuilder().withDescricao("Banho").withMarcado(true).withHora("13:00").build();
}