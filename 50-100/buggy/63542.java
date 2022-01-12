private static java.lang.String getPartitionType(org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument document, int offset) {
    org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion region = document.getRegionAtCharacterOffset(offset);
    org.eclipse.php.internal.core.util.text.TextSequence statement = org.eclipse.php.internal.core.util.text.PHPTextSequenceUtilities.getStatement(offset, region, false);
    if (statement == null)
        return null;
    
    java.lang.String partitionType = org.eclipse.php.internal.core.util.text.TextSequenceUtilities.getTypeByAbsoluteOffset(statement, offset);
    return partitionType;
}