@org.junit.Test
public void should_open_file_store_on_edit() throws java.lang.Exception {
    final org.bonitasoft.studio.pagedesigner.ui.property.section.control.PageDesignerMappingComposite pageDesignerMappingComposite = makeComposite();
    org.mockito.Mockito.when(webPageRepositoryStore.getChild("a-page-id")).thenReturn(selectedPage);
    pageDesignerMappingComposite.editForm(new org.eclipse.core.databinding.observable.value.WritableValue(org.bonitasoft.studio.model.process.builders.FormMappingBuilder.aFormMapping().havingTargetForm(org.bonitasoft.studio.model.expression.builders.ExpressionBuilder.anExpression().withContent("a-page-id")).build(), org.bonitasoft.studio.model.process.FormMapping.class));
    org.mockito.Mockito.verify(selectedPage).open();
}