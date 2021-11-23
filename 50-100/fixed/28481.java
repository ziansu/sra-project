@java.lang.Override
protected java.lang.String load() {
    fr.openwide.core.showcase.core.business.task.model.ShowcaseBatchReportBean showcaseReportBean = reportBeanModel.getObject();
    java.lang.Long id = idModel.getObject();
    if ((showcaseReportBean != null) && (id != null)) {
        return showcaseReportBean.getNotTreatedObjects().get(id);
    }
    return null;
}