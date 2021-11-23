@org.testng.annotations.BeforeClass
public void setUp() throws java.lang.Exception {
    super.setUp();
    org.apache.atlas.typesystem.types.TypeSystem typeSystem = org.apache.atlas.typesystem.types.TypeSystem.getInstance();
    org.apache.atlas.TestUtils.defineDeptEmployeeTypes(typeSystem);
    org.apache.atlas.typesystem.Referenceable hrDept = org.apache.atlas.TestUtils.createDeptEg1(typeSystem);
    org.apache.atlas.typesystem.types.ClassType deptType = typeSystem.getDataType(org.apache.atlas.typesystem.types.ClassType.class, "Department");
    org.apache.atlas.typesystem.ITypedReferenceableInstance hrDept2 = deptType.convert(hrDept, Multiplicity.REQUIRED);
    repositoryService.createEntity(hrDept2);
}