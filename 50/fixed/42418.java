public void setUserMessagesModels(java.util.List<ink.va.models.UserMessagesModel> userMessagesModels) {
    java.util.Collections.sort(userMessagesModels);
    this.userMessagesModels.clear();
    this.userMessagesModels.addAll(userMessagesModels);
    notifyDataSetChanged();
}