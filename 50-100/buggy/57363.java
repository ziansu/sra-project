@org.junit.Before
public void startApp() {
    io.pathfinder.BaseAppTest.app = play.test.Helpers.fakeApplication(play.test.Helpers.inMemoryDatabase());
    play.test.Helpers.start(io.pathfinder.BaseAppTest.app);
    io.pathfinder.BaseAppTest.PATHFINDER_APPLICATION.id_$eq(io.pathfinder.BaseAppTest.APPLICATION_ID);
    io.pathfinder.BaseAppTest.PATHFINDER_APPLICATION.name_$eq("MY COOL APP");
    io.pathfinder.BaseAppTest.cluster.path_$eq(io.pathfinder.BaseAppTest.CLUSTER_PATH);
    io.pathfinder.BaseAppTest.cluster.insert();
    io.pathfinder.BaseAppTest.PATHFINDER_APPLICATION.cluster_$eq(io.pathfinder.BaseAppTest.cluster);
    io.pathfinder.BaseAppTest.PATHFINDER_APPLICATION.insert();
    io.pathfinder.BaseAppTest.cluster.save();
}