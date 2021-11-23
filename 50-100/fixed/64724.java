public void upgrade() {
    java.lang.System.setProperty(SpringApplication.BANNER_LOCATION_PROPERTY, "upgrade-banner.txt");
    org.springframework.context.ConfigurableApplicationContext upgradeCxt = new org.springframework.boot.builder.SpringApplicationBuilder(com.thinkbiganalytics.server.upgrade.KyloUpgradeConfig.class).web(true).profiles(com.thinkbiganalytics.server.upgrade.KyloUpgrader.KYLO_UPGRADE).run();
    try {
        com.thinkbiganalytics.server.upgrade.KyloUpgradeService upgradeService = upgradeCxt.getBean(com.thinkbiganalytics.server.upgrade.KyloUpgradeService.class);
        while (!(upgradeService.upgradeNext()));
    } finally {
        upgradeCxt.close();
    }
}