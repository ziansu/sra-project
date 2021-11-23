private void addCommentToList(gov.va.isaac.gui.mapping.data.MappingItemComment comment) {
    gov.va.isaac.gui.mapping.CommentControl cc = new gov.va.isaac.gui.mapping.CommentControl();
    cc.setPrefWidth(commentListVBox.getPrefWidth());
    cc.setComment(comment);
    commentListVBox.setPrefHeight(((commentListVBox.getPrefHeight()) + (cc.getPrefHeight())));
    commentListVBox.getChildren().add(cc);
}