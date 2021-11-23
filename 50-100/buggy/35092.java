public static corp.skaj.foretagskvitton.view.CompanyListFragment createCompanyList(android.content.Context context, java.util.List<corp.skaj.foretagskvitton.model.Company> companyList, corp.skaj.foretagskvitton.controllers.IActivity listener) {
    corp.skaj.foretagskvitton.view.CompanyAdapter ca = new corp.skaj.foretagskvitton.view.CompanyAdapter(R.layout.company_list_item, companyList);
    corp.skaj.foretagskvitton.controllers.CompanyListFABController fabController = new corp.skaj.foretagskvitton.controllers.CompanyListFABController(context);
    corp.skaj.foretagskvitton.view.CompanyListFragment fragment = corp.skaj.foretagskvitton.view.CompanyListFragment.create(ca, fabController);
    new corp.skaj.foretagskvitton.controllers.CompanyToolbarController(context, ca, listener, fragment);
    return fragment;
}