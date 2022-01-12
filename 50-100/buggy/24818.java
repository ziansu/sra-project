@org.testng.annotations.Test(dataProvider = "Success")
public void testSuccessOnNewEntityLocks(int totalEntityLocks, int danglingEntityLocks, int hostCount) throws java.lang.Throwable {
    machine = com.vmware.photon.controller.cloudstore.xenon.helpers.TestEnvironment.create(hostCount);
    seedTestEnvironment(machine, totalEntityLocks, danglingEntityLocks);
    request.entityLockDeleteWatermarkTimeInMicros = com.vmware.xenon.common.Utils.getNowMicrosUtc();
    com.vmware.photon.controller.cloudstore.xenon.task.EntityLockCleanerService.State response = machine.callServiceAndWaitForState(EntityLockCleanerFactoryService.SELF_LINK, request, EntityLockCleanerService.State.class, (com.vmware.photon.controller.cloudstore.xenon.task.EntityLockCleanerService.State state) -> state.taskState.stage == TaskState.TaskStage.FINISHED);
    org.hamcrest.MatcherAssert.assertThat(response.danglingEntityLocksWithInactiveTasks, org.hamcrest.Matchers.is(0));
    org.hamcrest.MatcherAssert.assertThat(response.releasedEntityLocks, org.hamcrest.Matchers.is(0));
}