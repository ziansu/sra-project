@org.junit.Test
public void setSelectRename_smallerThanPrevious() {
    selectValuesMeta.setSelectRename(new java.lang.String[]{ org.pentaho.di.trans.steps.selectvalues.SelectValuesMetaTest.FIRST_FIELD , org.pentaho.di.trans.steps.selectvalues.SelectValuesMetaTest.SECOND_FIELD });
    selectValuesMeta.setSelectRename(new java.lang.String[]{ org.pentaho.di.trans.steps.selectvalues.SelectValuesMetaTest.FIRST_FIELD });
    org.junit.Assert.assertArrayEquals(new java.lang.String[]{ org.pentaho.di.trans.steps.selectvalues.SelectValuesMetaTest.FIRST_FIELD , null }, selectValuesMeta.getSelectRename());
}