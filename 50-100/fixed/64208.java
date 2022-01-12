@org.junit.Before
public void setUp() throws java.lang.Exception {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    org.springframework.boot.test.json.JacksonTester.initFields(this, objectMapper);
    org.mockito.MockitoAnnotations.initMocks(this);
    library_project.controllers.LibraryControllerTests.library = org.mockito.Mockito.mock(library_project.models.Library.class);
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(new library_project.controllers.LibraryController(library_project.controllers.LibraryControllerTests.library)).build();
    when(library_project.controllers.LibraryControllerTests.library.requestBook(any(java.lang.Integer.class))).thenReturn(((long) (1)));
}