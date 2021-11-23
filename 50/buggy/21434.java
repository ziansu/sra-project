@java.lang.Override
public void tearDown() throws java.lang.Exception {
    net.polybugger.apollot.db.ApolloDbAdapter.close();
    super.tearDown();
}