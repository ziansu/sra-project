public void saveLastConnectionBean(org.talend.core.model.general.ConnectionBean connBean) {
    perReader.saveLastConnectionBean(connBean);
    if (connBean != null) {
        lastConnection = connBean.getName();
    }
}