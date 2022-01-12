@org.junit.Test
public void total_isCorrect() throws java.lang.Exception {
    double total = 0;
    coljamkop.momoney.dummy.Category category = new coljamkop.momoney.dummy.Category(0.0, 20.0);
    for (int i = 0; i < 10; i++) {
        category.addExpense(new coljamkop.momoney.dummy.Expense(10.0));
        total += 10.0;
        assertEquals(total, category.getTotal(), 0.0);
    }
}