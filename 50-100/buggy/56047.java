private void addCommentToList(gov.va.isaac.gui.mapping.data.MappingItemComment comment) {
    gov.va.isaac.gui.mapping.CommentControl cc = new gov.va.isaac.gui.mapping.CommentControl();
    javafx.scene.layout.AnchorPane.setLeftAnchor(cc, 0.0);
    javafx.scene.layout.AnchorPane.setRightAnchor(cc, 10.0);
    cc.setPrefWidth(commentListVBox.getPrefWidth());
    cc.setComment(comment);
    commentListVBox.setPrefHeight(((commentListVBox.getPrefHeight()) + (cc.getPrefHeight())));
    commentListVBox.getChildren().add(cc);
}