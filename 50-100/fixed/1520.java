public static void main(java.lang.String[] args) {
    Main main = new Main();
    main.loadData("iris-training.txt", "iris-test.txt");
    java.util.ArrayList<java.lang.String> predictions = new java.util.ArrayList<java.lang.String>();
    for (Iris i : main.testingSet) {
        java.lang.String result = main.knnAlg(main.trainingSet, i, 1);
        predictions.add(result);
    }
    double accuracy = main.getAccuracy(main.testingSet, predictions);
    java.lang.System.out.println((("The algorithm is " + accuracy) + "% accurate"));
}