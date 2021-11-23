private void fillAdapters() {
    java.util.List<android.support.v4.app.Fragment> fragments = new java.util.ArrayList<android.support.v4.app.Fragment>();
    fragmentPosition = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    int position = 0;
    fragments.add(com.example.pc.restoapplication.Categories.CategoryFragment.newInstance());
    fragmentPosition.put(Constant.CATEGORYFRAGMENT, (position++));
    fragments.add(com.example.pc.restoapplication.Products.ProductFragment.newInstance());
    fragmentPosition.put(Constant.PRODUCTFRAGMENT, (position++));
    mFragmentAdapter.addAll(fragments);
}