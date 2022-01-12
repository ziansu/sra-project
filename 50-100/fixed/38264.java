@java.lang.Override
public java.util.ArrayList<org.opentdc.wtt.CompanyModel> listCompanies(java.lang.String query, java.lang.String queryType, int position, int size) {
    java.util.ArrayList<org.opentdc.wtt.CompanyModel> _companyModels = new java.util.ArrayList<org.opentdc.wtt.CompanyModel>();
    for (org.opentdc.wtt.file.WttCompany _c : org.opentdc.wtt.file.FileServiceProvider.companyIndex.values()) {
        org.opentdc.wtt.file.FileServiceProvider.logger.info(org.opentdc.util.PrettyPrinter.prettyPrintAsJSON(_c.getCompanyModel()));
        _companyModels.add(_c.getCompanyModel());
    }
    org.opentdc.wtt.file.FileServiceProvider.logger.info((("listCompanies() -> " + (_companyModels.size())) + " companies"));
    return _companyModels;
}