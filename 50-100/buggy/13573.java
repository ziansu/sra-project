@org.junit.Test
public void testDashboardApplicant() throws java.lang.Exception {
    setLoggedInUser(applicant);
    org.innovateuk.ifs.dashboard.viewmodel.ApplicantDashboardViewModel viewModel = new org.innovateuk.ifs.dashboard.viewmodel.ApplicantDashboardViewModel();
    org.mockito.Mockito.when(populator.populate(applicant)).thenReturn(viewModel);
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/applicant/dashboard")).andExpect(status().isOk()).andExpect(view().name("applicant-dashboard")).andExpect(model().attribute("model", viewModel));
}