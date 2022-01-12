private void saveHTTPAction(com.dbf.loadtester.common.action.HTTPAction action) throws java.io.IOException {
    if (null != (testPlanWriter)) {
        com.dbf.loadtester.recorder.RecorderBase.log.info(("Recording Action: " + action));
        testPlanWriter.write(com.dbf.loadtester.common.json.JsonEncoder.toJson(action));
        testPlanWriter.newLine();
        testPlanWriter.flush();
    }
}