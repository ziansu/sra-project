private java.lang.String deleteGrade(final java.lang.String deleteGrade, final org.ednovo.gooru.core.api.model.User user, final org.ednovo.gooru.core.api.model.User apiCaller) {
    final org.ednovo.gooru.core.api.model.CustomTableValue type = this.getCustomTableRepository().getCustomTableValue(CustomProperties.Table.USER_CLASSIFICATION_TYPE.getTable(), CustomProperties.UserClassificationType.GRADE.getUserClassificationType());
    this.getUserRepository().deleteUserClassificationByGrade(apiCaller.getPartyUid(), deleteGrade);
    return this.getUserRepository().getUserGrade(user.getGooruUId(), type.getCustomTableValueId(), null);
}