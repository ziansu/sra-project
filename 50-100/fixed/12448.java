@javax.annotation.PostConstruct
public void init() {
    try {
        org.elasticsearch.common.settings.Settings.Builder elasticsearchSettings = org.elasticsearch.common.settings.Settings.settingsBuilder().put("cluster.name", matchpconfig.getEsClusterName()).put("path.home", matchpconfig.getEsPath());
        node = org.elasticsearch.node.NodeBuilder.nodeBuilder().local(true).settings(elasticsearchSettings.build()).node();
        Reindex();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}