@org.junit.Test
public void basicTestDTOPOJOExtended() {
    org.fields.utils.fieldsCopier.resources.CopierDefs.ObjectDTO dto = org.fields.utils.fieldsCopier.resources.CopierDefs.newDTO();
    org.fields.utils.fieldsCopier.resources.CopierDefs.ObjectPOJO pojo = new org.fields.utils.fieldsCopier.resources.CopierDefs.ObjectPOJOExtended();
    org.junit.Assert.assertNotEquals(dto, pojo);
    org.fields.utils.fieldsCopier.FieldsCopier.copy(pojo, dto);
    assertProps(dto, pojo);
}