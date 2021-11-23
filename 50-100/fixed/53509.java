@java.lang.Override
protected void populateItem(org.apache.wicket.markup.html.list.ListItem<at.dru.wicketblog.model.Post> item) {
    item.add(new at.dru.wicketblog.components.EditableText("title", new org.apache.wicket.model.PropertyModel(item.getModel(), "title"), FieldType.TEXT_FIELD, at.dru.wicketblog.model.Post.class));
    item.add(new at.dru.wicketblog.components.EditableText("content", new org.apache.wicket.model.PropertyModel(item.getModel(), "content"), FieldType.TEXT_AREA, at.dru.wicketblog.model.Post.class));
}