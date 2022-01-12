private void RestoreFragmentsStates(android.os.Bundle savedInstanceState) {
    com.example.kamil.astroweather.MainActivity.currentPages = new java.util.HashMap<>();
    if ((getSupportFragmentManager().getFragments()) != null) {
        if (com.example.kamil.astroweather.MainActivity.isTablet) {
            com.example.kamil.astroweather.MainActivity.currentPages.put("commonFragment", getSupportFragmentManager().getFragment(savedInstanceState, "commonFragment"));
        }else {
            com.example.kamil.astroweather.MainActivity.currentPages.put("sunFragment", getSupportFragmentManager().getFragment(savedInstanceState, "sunFragment"));
            com.example.kamil.astroweather.MainActivity.currentPages.put("moonFragment", getSupportFragmentManager().getFragment(savedInstanceState, "moonFragment"));
        }
    }
}