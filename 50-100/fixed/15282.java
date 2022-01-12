private static void getData() {
    ClassificationMethods.data = DataRetrievalLayer.GetData();
    ClassificationMethods.activeData = new java.util.ArrayList<java.util.ArrayList<java.lang.Double>>(ClassificationMethods.data.subList(0, 1347));
    ClassificationMethods.nonActiveData = new java.util.ArrayList<java.util.ArrayList<java.lang.Double>>(ClassificationMethods.data.subList(1347, DataRetrievalLayer.dataLength));
    ClassificationMethods.activeMeanVector = DataRetrievalLayer.GetActiveMeanVector();
    ClassificationMethods.nonActiveMeanVector = DataRetrievalLayer.GetNonActiveMeanVector();
    ClassificationMethods.activeSTD = DataRetrievalLayer.GetActiveSTD();
    ClassificationMethods.nonActiveSTD = DataRetrievalLayer.GetNonActiveSTD();
}