@org.junit.Test
public void testToggleEditMode() throws java.lang.Exception {
    com.dariuszdeoniziak.charades.views.activities.CategoriesActivity spy = org.mockito.Mockito.spy(activity);
    spy.toggleViewMode(null);
    com.dariuszdeoniziak.charades.views.fragments.CategoriesFormFragment fragment = com.dariuszdeoniziak.charades.views.fragments.CategoriesFormFragment.newInstance();
    org.mockito.Mockito.verify(spy).replaceFragment(org.mockito.Mockito.any(android.os.Bundle.class), org.mockito.Mockito.any(com.dariuszdeoniziak.charades.views.fragments.CategoriesFormFragment.class), org.mockito.Matchers.eq(R.id.fragment_container), org.mockito.Matchers.eq(fragment.TAG));
    spy.toggleViewMode(null);
    org.mockito.Mockito.verify(spy).popFragmentBackStack();
}