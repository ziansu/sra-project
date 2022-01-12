@org.junit.Test
@org.junit.Ignore
public void insertStart() {
    com.sixsq.slipstream.persistence.Vm vm = new com.sixsq.slipstream.persistence.Vm("instance-id", "cloud", "running", "user", true);
    for (int i = 0; i < 100; i++) {
        com.sixsq.slipstream.connector.UsageRecorder.insertStart(("123456" + i), "joe", "aws", com.sixsq.slipstream.connector.UsageRecorder.createVmMetrics(vm));
        com.sixsq.slipstream.connector.UsageRecorder.insertEnd(("123456" + i), "joe", "aws", com.sixsq.slipstream.connector.UsageRecorder.createVmMetrics(vm));
    }
}