public java.lang.String getKeyColumn() {
    if (((p_keyColumn) == null) || (p_keyColumn.isEmpty()))
        p_keyColumn = m_Browse.getFieldKey().getAD_View_Column().getColumnName();
    
    return p_keyColumn;
}