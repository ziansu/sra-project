@org.junit.Test
public void setModel_withZeroItemsAndLoadingTrue_setsAdapterItemsAndLoading() {
    final java.util.List<org.edx.mobile.profiles.BadgeAssertion> items = java.util.Collections.emptyList();
    view.setModel(new org.edx.mobile.profiles.UserProfileAccomplishmentsPresenter.ViewModel(items, true, false));
    org.mockito.Mockito.verify(mockAdapter).setItems(items);
    org.mockito.Mockito.verify(mockAdapter).setPageLoading(true);
}