@org.junit.Test
public void testSomeMethod() {
    java.io.InputStream treinoInputStream = getClass().getResourceAsStream("/conjuntos/treino.data");
    java.io.InputStream testeInputStream = getClass().getResourceAsStream("/conjuntos/teste.data");
    knn.KNN knn;
    try {
        knn = new knn.KNN(3, treinoInputStream, testeInputStream);
        knn.classify();
        java.lang.System.out.println(knn.getMatrizConfusao().getAccuracy());
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        fail();
    }
}