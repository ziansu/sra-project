@java.lang.Override
public boolean matches(java.lang.Object argument) {
    org.junit.Assert.assertThat(((org.eclipse.jface.viewers.StructuredSelection) (argument)).toList(), org.hamcrest.collection.IsCollectionContaining.hasItems(treeItemA.getData(), treeItemB.getData(), treeItemC_B.getData()));
    org.junit.Assert.assertThat(((org.eclipse.jface.viewers.StructuredSelection) (argument)).toList(), not(org.hamcrest.collection.IsCollectionContaining.hasItems(treeItemC.getData())));
    return true;
}