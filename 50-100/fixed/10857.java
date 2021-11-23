public static void stopSparkProgram() {
    if ((co.cask.cdap.internal.app.runtime.spark.SparkProgramWrapper.getSparkContext()) != null) {
        if (co.cask.cdap.internal.app.runtime.spark.SparkProgramWrapper.isScalaProgram()) {
            ((co.cask.cdap.api.spark.SparkContext) (co.cask.cdap.internal.app.runtime.spark.SparkProgramWrapper.getSparkContext().getOriginalSparkContext())).stop();
        }else {
            ((co.cask.cdap.internal.app.runtime.spark.JavaSparkContext) (co.cask.cdap.internal.app.runtime.spark.SparkProgramWrapper.getSparkContext().getOriginalSparkContext())).stop();
        }
    }
}