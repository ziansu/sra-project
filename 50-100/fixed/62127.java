public static void main(java.lang.String[] args) throws java.lang.Exception {
    weka.core.Instances trainingCancer = HomeWork2.MainHW2.loadData("cancer_train.txt");
    weka.core.Instances testingCancer = HomeWork2.MainHW2.loadData("cancer_test.txt");
    weka.core.Instances validationCancer = HomeWork2.MainHW2.loadData("cancer_validation.txt");
    HomeWork2.DecisionTree tree = new HomeWork2.DecisionTree();
    tree.buildClassifier(trainingCancer);
    java.lang.System.out.println(trainingCancer.get(3).classValue());
}