@org.junit.Test
public void testDestroy() {
    main.run(new java.lang.String[]{ "destroy" });
    verify(commandDestroy).execute();
}