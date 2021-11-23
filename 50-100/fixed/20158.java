@org.junit.BeforeClass
public static void beforeClass() throws java.lang.Exception {
    co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.cConf = co.cask.cdap.common.conf.CConfiguration.create();
    co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.hBaseTableUtil = new co.cask.cdap.data2.util.hbase.HBaseTableUtilFactory(co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.cConf, new co.cask.cdap.common.namespace.SimpleNamespaceQueryAdmin()).get();
    co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.ddlExecutor = new co.cask.cdap.data2.util.hbase.HBaseDDLExecutorFactory(co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.cConf, co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.TEST_HBASE.getConfiguration()).get();
    co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.ddlExecutor.createNamespaceIfNotExists(co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.hBaseTableUtil.getHBaseNamespace(co.cask.cdap.data2.dataset2.lib.table.hbase.NAMESPACE1));
    co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.ddlExecutor.createNamespaceIfNotExists(co.cask.cdap.data2.dataset2.lib.table.hbase.HBaseTableTest.hBaseTableUtil.getHBaseNamespace(co.cask.cdap.data2.dataset2.lib.table.hbase.NAMESPACE2));
}