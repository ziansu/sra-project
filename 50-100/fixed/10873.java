private void startQueueMonitor() {
    try {
        MQApi.Models.Query.ConnectionDetailModel connectionDetail = UI.TreeHelper.GetCurrentConnectionDetail(TreeView);
        com.ibm.mq.MQQueueManager queueManager = MQApi.Connection.MQConnection.GetMQQueueManager(connectionDetail);
        UI.Dialogs.QueueMonitorDialog dialog = new UI.Dialogs.QueueMonitorDialog(this, false, queueManager);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    } catch (com.ibm.mq.MQException ex) {
        MQApi.Logs.LogWriter.WriteToLog(ex.fillInStackTrace());
        javax.swing.JOptionPane.showMessageDialog(this, MQApi.Utilities.MQUtility.getMQReturnMessage(ex.completionCode, ex.getReason()), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}