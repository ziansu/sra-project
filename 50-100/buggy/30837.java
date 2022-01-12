private org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkOperPlan compile(org.apache.pig.backend.hadoop.executionengine.physicalLayer.plans.PhysicalPlan physicalPlan, org.apache.pig.impl.PigContext pigContext) throws java.io.IOException, org.apache.pig.impl.plan.PlanException, org.apache.pig.impl.plan.VisitorException {
    org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkCompiler sparkCompiler = new org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkCompiler(physicalPlan, pigContext);
    sparkCompiler.compile();
    sparkCompiler.connectSoftLink();
    org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkOperPlan sparkPlan = sparkCompiler.getSparkPlan();
    org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkPOPackageAnnotator pkgAnnotator = new org.apache.pig.backend.hadoop.executionengine.spark.plan.SparkPOPackageAnnotator(sparkPlan);
    pkgAnnotator.visit();
    optimize(pigContext, sparkPlan);
    return sparkPlan;
}