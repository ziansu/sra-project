public void refresh() {
    java.util.List<com.bkv.intellij.circleci.build.BuildInterface> builds = null;
    try {
        builds = client.getRecentBuilds();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}