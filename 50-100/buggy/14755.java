private void fillIgnoredProblemTable() {
    try {
        com.liferay.ide.project.core.upgrade.IgnoredProblemsContainer mpContainer = com.liferay.ide.project.core.upgrade.UpgradeAssistantSettingsUtil.getObjectFromStore(com.liferay.ide.project.core.upgrade.IgnoredProblemsContainer.class);
        com.liferay.blade.api.Problem[] problems = mpContainer.getProblemMap().values().toArray(new com.liferay.blade.api.Problem[0]);
        _ignoredProblemTable.setInput(problems);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}