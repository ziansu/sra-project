private void givenExistsBudget(com.odde.bbuddy.budget.Budget budget) {
    org.mockito.Mockito.when(mockBudgetRepo.findAll()).thenReturn(java.util.Arrays.asList(budget));
}