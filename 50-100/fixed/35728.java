public static void createInstanceAndSave(int core, int numberOfGenerators, int numberOfLoadsForGenerator, int R, double xmean, double delta, java.lang.String path) {
    powerGrid.PowerGrid tempInstance;
    try {
        tempInstance = new powerGrid.PowerGrid(core, numberOfGenerators, numberOfLoadsForGenerator, R, xmean, delta, (-1));
        tempInstance.saveToFile(path);
    } catch (exception.NoMoreGeneratorsException ex) {
        java.lang.System.out.println("No more generators! Retrying!");
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}