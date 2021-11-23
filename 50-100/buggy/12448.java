@javax.annotation.PostConstruct
public void init() {
    org.elasticsearch.common.settings.Settings.Builder elasticsearchSettings = org.elasticsearch.common.settings.Settings.settingsBuilder().put("cluster.name", matchpconfig.getEsClusterName()).put("path.home", matchpconfig.getEsPath());
    node = org.elasticsearch.node.NodeBuilder.nodeBuilder().local(true).settings(elasticsearchSettings.build()).node();
    try {
        Reindex();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.CloneNotSupportedException e) {
        e.printStackTrace();
    }
}