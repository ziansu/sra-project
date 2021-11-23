@java.lang.Override
public void buildCompanyFragment() {
    corp.skaj.foretagskvitton.view.CompanyListFragment fragment = corp.skaj.foretagskvitton.activities.ListFragmentFactory.createCompanyList(this, getCompanies());
    mController.setCompanyAdapterListener(fragment.getAdapter(), corp.skaj.foretagskvitton.activities.CompanyActivity.class, corp.skaj.foretagskvitton.activities.MainActivity.COMPANY_KEY);
    replaceFragment(fragment);
}