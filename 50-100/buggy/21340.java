@org.junit.Before
public void setup() {
    executors = org.easymock.EasyMock.createMock(java.util.concurrent.ExecutorService.class);
    com.metamx.emitter.service.ServiceEmitter emitter = org.easymock.EasyMock.createNiceMock(com.metamx.emitter.service.ServiceEmitter.class);
    decorator = new io.druid.query.IntervalChunkingQueryRunnerDecorator(executors, QueryRunnerTestHelper.NOOP_QUERYWATCHER, emitter, null);
    baseRunner = org.easymock.EasyMock.createMock(io.druid.query.QueryRunner.class);
    toolChest = org.easymock.EasyMock.createNiceMock(io.druid.query.QueryToolChest.class);
}