public static by.istin.android.xcore.source.DataSourceRequest fromBundle(android.os.Bundle bundle) {
    by.istin.android.xcore.source.DataSourceRequest data = new by.istin.android.xcore.source.DataSourceRequest();
    android.os.Bundle dataSourceFromBundle = by.istin.android.xcore.provider.ModelContract.getDataSourceFromBundle(bundle);
    if (dataSourceFromBundle != null) {
        data.mBundle = dataSourceFromBundle;
    }
    return data;
}