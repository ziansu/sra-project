private static void test1() {
    edu.neu.ccs.pyramid.dataset.MultiLabelClfDataSet dataSet = edu.neu.ccs.pyramid.dataset.MLClfDataSetBuilder.getBuilder().numDataPoints(10).numFeatures(3).numClasses(4).dense(true).missingValue(false).build();
    java.lang.System.out.println(dataSet.getMetaInfo());
}