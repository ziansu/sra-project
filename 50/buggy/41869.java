public void init(org.pentaho.di.core.row.RowMetaInterface outputRowMeta) throws org.pentaho.di.core.exception.KettlePluginException {
    for (org.pentaho.di.trans.steps.sequoiadbinput.SequoiaDBInputField f : m_fields) {
        int outputIndex = outputRowMeta.indexOfValue(f.m_fieldName);
        f.init(outputIndex);
    }
}