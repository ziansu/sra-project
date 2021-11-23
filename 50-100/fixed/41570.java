@org.junit.jupiter.api.BeforeEach
public void initGraph() {
    gat.MockStorage storage = new gat.MockStorage();
    g = greycat.GraphBuilder.newBuilder().withPlugin(new gat.AdditionalTypesPlugin()).withStorage(storage).withScheduler(new greycat.scheduler.NoopScheduler()).build();
    g.connect(null);
    n = g.newNode(0, 0);
}