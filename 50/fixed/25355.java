@java.lang.Override
public void onMoonSearch() {
    com.lemaqi.lunvr.MoonSearch moonSearch = new com.lemaqi.lunvr.MoonSearch();
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, moonSearch).commit();
}