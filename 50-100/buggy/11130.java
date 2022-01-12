@org.junit.Before
public void setUp() {
    java.lang.String field1 = "id";
    java.lang.String field2 = "name";
    java.lang.String[] fields = new java.lang.String[]{ field1 };
    root = new cn.ac.ucas.operator.AggregatorOperator();
    filter = new cn.ac.ucas.operator.MockFilterOperator();
    project = new cn.ac.ucas.operator.MockProjectOperator(fields);
    source = new cn.ac.ucas.operator.MockSourceOperator();
    org.junit.Assert.assertNotNull(source);
    project.setChild(source);
    filter.setChild(project);
    root.setChild(filter);
}