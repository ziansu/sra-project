private void updateActivityRow(org.activityinfo.model.form.FormClass formClass) {
    org.activityinfo.store.mysql.update.SqlUpdate activityUpdate = org.activityinfo.store.mysql.update.SqlUpdate.update("activity");
    activityUpdate.where("activityId", activity.getId());
    activityUpdate.setIfChanged("name", formClass.getLabel(), formClass.getLabel(), 255);
    activityUpdate.set("formClass", formClass.toJsonString());
    activityUpdate.set("version", newVersion);
    activityUpdate.set("schemaVersion", newVersion);
    activityUpdate.execute(executor);
}