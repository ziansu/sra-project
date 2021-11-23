public static void main(java.lang.String[] args) {
    edu.lu.uni.App example = new edu.lu.uni.App();
    try {
        edu.lu.uni.App.logger.info("****************Start to extract features by CNN****************\n");
        example.extractFeatures2();
        example.exportFeaturesByProjects();
        edu.lu.uni.App.logger.info("****************Finish off extracting features by CNN****************\n");
        example.exportFeaturesByProjects();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}