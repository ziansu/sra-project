private void verifySaveBudgetCalledWithId(int expected) {
    org.mockito.ArgumentCaptor<com.odde.bbuddy.budget.Budget> captor = org.mockito.ArgumentCaptor.forClass(com.odde.bbuddy.budget.Budget.class);
    verify(mockBudgetRepo).save(captor.capture());
    org.assertj.core.api.Assertions.assertThat(captor.getValue().getId()).isEqualTo(expected);
}