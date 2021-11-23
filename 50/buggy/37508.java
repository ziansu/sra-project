@java.lang.Override
protected void configureMockMvcBuilder(org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder mockMvcBuilder) {
    mockMvcBuilder.addFilters(traceFilter);
}