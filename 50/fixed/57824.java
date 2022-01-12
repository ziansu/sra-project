public void bindType(nl.fhict.happynews.android.model.Post post) {
    this.post = post;
    itemView.setAlpha((nl.fhict.happynews.android.controller.ReadingHistoryController.getInstance().postIsRead(post) ? 0.3F : 1.0F));
}