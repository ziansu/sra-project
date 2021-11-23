private java.lang.String GetCompanyAddress() {
    java.lang.String companyAddress = "";
    courierPD.CompanyInfo company = courierDAO.CompanyInfoDAO.findCompanyInfo("");
    companyAddress = company.getAddress();
    return companyAddress;
}