private void givenExistsBudget(com.odde.bbuddy.budget.Budget budget) {
    when(mockBudgetRepo.findAll()).thenReturn(java.util.Arrays.asList(budget));
}