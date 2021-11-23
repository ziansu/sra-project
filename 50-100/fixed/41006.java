@org.junit.Test
public void should_order_statement_entries() {
    java.util.List<london.Transaction> statements = new java.util.ArrayList<>();
    statements.add(new london.Transaction("19/01/2014", (-100)));
    statements.add(new london.Transaction("20/01/2014", 100));
    accountConsole.display(statements);
    org.mockito.Mockito.verify(console).println("DATE | AMOUNT | BALANCE");
    org.mockito.Mockito.verify(console).println("20/01/2014 | 100.0 | 0.0");
    org.mockito.Mockito.verify(console).println("19/01/2014 | -100.0 | -100.0");
}