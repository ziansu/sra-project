@org.junit.Test
public void onBindViewHolder_withPositionOfItem_calls_setContent() {
    final org.edx.mobile.profiles.BadgeAssertion badgeAssertion = new org.edx.mobile.profiles.BadgeAssertion();
    adapter.setItems(java.util.Collections.singletonList(badgeAssertion));
    final org.edx.mobile.profiles.AccomplishmentListAdapter.ItemViewHolder viewHolder = org.mockito.Mockito.mock(AccomplishmentListAdapter.ItemViewHolder.class);
    adapter.onBindViewHolder(viewHolder, 0);
    org.mockito.Mockito.verify(viewHolder).setContent(badgeAssertion);
}