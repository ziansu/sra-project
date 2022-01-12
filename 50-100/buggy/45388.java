private java.lang.String deleteGrade(java.lang.String deleteGrade, org.ednovo.gooru.core.api.model.User user, org.ednovo.gooru.core.api.model.User apiCaller) {
    org.ednovo.gooru.core.api.model.CustomTableValue type = this.getCustomTableRepository().getCustomTableValue(CustomProperties.Table.USER_CLASSIFICATION_TYPE.getTable(), CustomProperties.UserClassificationType.GRADE.getUserClassificationType());
    this.getUserRepository().deleteUserClassificationByGrade(apiCaller.getPartyUid(), deleteGrade);
    return this.getUserRepository().getUserGrade(user.getGooruUId(), type.getCustomTableValueId(), null);
}