@java.lang.Override
public com.jaspersoft.android.sdk.network.entity.execution.ExecutionStatus perform(java.lang.String token) throws com.jaspersoft.android.sdk.network.HttpException, java.io.IOException {
    return mExportApi.checkExportExecutionStatus(token, executionId, exportId);
}