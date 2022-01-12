@org.junit.Before
public void setup() {
    org.mockito.MockitoAnnotations.initMocks(this);
    org.cardiacatlas.xpacs.web.rest.PatientInfoResource patientInfoResource = new org.cardiacatlas.xpacs.web.rest.PatientInfoResource(patientInfoRepository, null, null, null, null);
    this.restPatientInfoMockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(patientInfoResource).setCustomArgumentResolvers(pageableArgumentResolver).setControllerAdvice(exceptionTranslator).setMessageConverters(jacksonMessageConverter).build();
}