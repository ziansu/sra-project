private void cacheUser(javax.servlet.http.HttpServletRequest request, interns.invoices.models.UserInfo googleUser) {
    if ((userRepository.findOne(googleUser.getId())) == null) {
        userRepository.save(googleUser);
    }
    java.util.Set<interns.invoices.models.Company> companies = companyRepository.findByOwner(googleUser);
    googleUser.setMyCompanies(companies);
    java.lang.System.out.println(("User companies: " + (companies.size())));
    request.getSession().setAttribute("user", googleUser);
}