protected static boolean isProperSubsetAttributeOf(final java.util.List<relationalDatabaseTools.client.Attribute> largerAttribute, final java.util.List<relationalDatabaseTools.client.Attribute> smallerAttribute) {
    if ((largerAttribute.size()) <= (smallerAttribute.size())) {
        return false;
    }
    for (relationalDatabaseTools.client.Attribute a : smallerAttribute) {
        if (!(relationalDatabaseTools.client.CalculateClosure.containsAttribute(largerAttribute, a))) {
            return false;
        }
    }
    return true;
}