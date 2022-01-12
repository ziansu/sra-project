@org.junit.Test
public void testState() throws java.io.IOException {
    main.run(new java.lang.String[]{ "state" });
    verify(commandState).execute();
}