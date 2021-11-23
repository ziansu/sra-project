public static void createFragment(java.lang.String url) {
    if (url == null)
        com.tona.mousebrowser2.MainActivity.adapter.add(("page" + ((com.tona.mousebrowser2.MainActivity.count)++)), new com.tona.mousebrowser2.CustomWebViewFragment(null));
    else
        com.tona.mousebrowser2.MainActivity.adapter.add(("page" + ((com.tona.mousebrowser2.MainActivity.count)++)), new com.tona.mousebrowser2.CustomWebViewFragment(url));
    
    com.tona.mousebrowser2.MainActivity.adapter.notifyDataSetChanged();
    com.tona.mousebrowser2.MainActivity.viewPager.setCurrentItem(((com.tona.mousebrowser2.MainActivity.adapter.getCount()) - 1));
}