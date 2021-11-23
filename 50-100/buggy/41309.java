public void removeAllExistingFragments() {
    java.util.List<android.support.v4.app.Fragment> fragmentlist = fragmentManager.getFragments();
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    java.lang.System.out.println("Fragment Namen::----------------------------------------");
    for (int i = 0; i < (fragmentlist.size()); i++) {
        transaction.remove(fragmentlist.get(i));
    }
    transaction.commit();
}