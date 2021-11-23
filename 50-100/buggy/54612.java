@java.lang.Override
protected void onUpdate(org.apache.wicket.ajax.AjaxRequestTarget target) {
    final boolean use = ((java.lang.Boolean) (this.getDefaultModelObject()));
    for (final mil.nga.giat.data.elasticsearch.ElasticAttribute attribute : attProvider.getItems()) {
        attribute.setUse(use);
    }
    target.addComponent(elasticAttributePanel);
}