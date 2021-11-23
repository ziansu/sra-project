@org.junit.Before
public void setUp() {
    org.onosproject.yang.runtime.impl.MockYangSchemaNodeProvider.processSchemaRegistry();
    reg = org.onosproject.yang.runtime.impl.MockYangSchemaNodeProvider.registry();
    builder = new org.onosproject.yang.runtime.impl.ModIdToRscIdConverter(reg);
}