@java.lang.Override
@org.junit.Before
public void setUp() throws java.lang.Exception {
    super.setUp();
    unit.daos.template.QACategoryDAOTEST.superCategory1 = base.AbstractTestDataCreator.createCategory("Super1", null, "icon");
    unit.daos.template.QACategoryDAOTEST.superCategory2 = base.AbstractTestDataCreator.createCategory("Super2", null, "icon");
    unit.daos.template.QACategoryDAOTEST.subCategory1 = base.AbstractTestDataCreator.createCategory("Sub1", unit.daos.template.QACategoryDAOTEST.superCategory1.getId(), "icon");
}