@java.lang.Override
protected void onClick(org.apache.wicket.ajax.AjaxRequestTarget target) {
    super.onClick(target);
    tree.select(target, lemming.ui.tree.GenericFolder.getModelObject());
}