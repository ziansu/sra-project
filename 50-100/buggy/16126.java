private void removeJob(co.cask.cdap.api.dataset.table.Table table, org.quartz.JobKey key) {
    byte[][] col = new byte[1][];
    col[0] = co.cask.cdap.api.common.Bytes.toBytes(key.getName());
    table.delete(co.cask.cdap.internal.app.runtime.schedule.store.DatasetBasedTimeScheduleStore.JOB_KEY, col);
}