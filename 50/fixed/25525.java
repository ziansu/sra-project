@org.junit.Test(expected = org.springframework.security.access.AccessDeniedException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "companyadmin@example.de", roles = { "COMPANY_ADMIN" })
public void updateWrongCompanyWithCompanyAdmin() throws java.lang.Exception {
    mockDataCreator.createUsers();
    com.github.schlegel.springjwt.service.company.transport.CompanyUpdateDto companyUpdate = new com.github.schlegel.springjwt.service.company.transport.CompanyUpdateDto();
    companyUpdate.setDescription("Updated Company Description");
    companyService.updateCompany(java.util.UUID.randomUUID(), companyUpdate);
}