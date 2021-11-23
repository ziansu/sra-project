@java.lang.Override
public void timeout() {
    if (systemSettingController.isNotTestingOrTestRunning()) {
        fi.otavanopisto.kuntaapi.server.tasks.OrganizationEntityUpdateTask task = organizationVCardsTaskQueue.next();
        if (task != null) {
            updateContacts(task.getOrganizationId());
        }else {
            if (organizationVCardsTaskQueue.isEmpty()) {
                organizationVCardsTaskQueue.enqueueTasks(organizationSettingController.listOrganizationIdsWithSetting(VCardConsts.ORGANIZATION_SETTING_URL));
            }
        }
    }
}