public void resetSetting() {
    java.util.Random random = new java.util.Random(java.lang.System.currentTimeMillis());
    resource.GameResources gameResources = ((resource.GameResources) (resource.ResourceFactory.getResource(((java.lang.System.getProperty("user.dir")) + "/config/game.json"))));
    x = random.nextInt(gameResources.getGameFieldWidth());
    y = random.nextInt(gameResources.getGameFieldHeight());
    isKilled = false;
}