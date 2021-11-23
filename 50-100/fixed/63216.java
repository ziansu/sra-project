@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if (com.example.kamil.astroweather.MainActivity.isTablet) {
        getSupportFragmentManager().putFragment(outState, "sunFragment", com.example.kamil.astroweather.MainActivity.currentPages.get("sunFragment"));
    }else {
        getSupportFragmentManager().putFragment(outState, "sunFragment", com.example.kamil.astroweather.MainActivity.currentPages.get("sunFragment"));
        getSupportFragmentManager().putFragment(outState, "moonFragment", com.example.kamil.astroweather.MainActivity.currentPages.get("moonFragment"));
    }
}