@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle args = this.getIntent().getExtras();
    if ((args != null) && (args.containsKey(com.c24.rs.app.screens.tariffList.TariffListActivity.PARAM_SEARCH))) {
        tariffSearchQuery = ((com.c24.rs.bl.queries.SearchTariffQuery) (args.getSerializable(com.c24.rs.app.screens.tariffList.TariffListActivity.PARAM_SEARCH)));
    }else {
        tariffSearchQuery = complexPreferences.getObject(CacheKeys.CURRENT_SEARCH_QUERY, com.c24.rs.bl.queries.SearchTariffQuery.class);
    }
}