public void bindCompany(edu.umd.cs.jobi.model.Company company) {
    this.company = company;
    if (company != null) {
        companyName.setText(company.getName());
    }
}