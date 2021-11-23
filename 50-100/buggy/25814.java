@java.lang.Override
public boolean equals(final java.lang.Object other) {
    if (!(other instanceof com.lassitercg.faces.components.sheet.Sheet.RowColIndex))
        return false;
    
    com.lassitercg.faces.components.sheet.Sheet.RowColIndex castOther = ((com.lassitercg.faces.components.sheet.Sheet.RowColIndex) (other));
    return new org.apache.commons.lang3.builder.EqualsBuilder().append(rowKey, castOther.rowKey).append(colIndex, castOther.colIndex).isEquals();
}