@org.junit.Test
public void testIriskFoldCrossErrors() {
    java.lang.String fileName = "iris.csv";
    java.net.URL url = this.getClass().getClassLoader().getResource(fileName);
    us.parr.animl.data.DataTable data = us.parr.animl.data.DataTable.loadCSV(url.getFile(), null, null, null, true);
    us.parr.animl.classifiers.trees.DecisionTree.debug = true;
    int kfolds = 5;
    int minLeafSize = us.parr.animl.TestRFDataSets.MIN_LEAF_SIZE;
    int[] sizes = new int[]{ 10 , 50 , 100 , 200 };
    RF_kFoldCrossErrors(fileName, data, sizes, kfolds, minLeafSize, 0.03);
}