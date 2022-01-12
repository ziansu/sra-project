@java.lang.Override
public void configurePipeline(co.cask.cdap.etl.api.PipelineConfigurer pipelineConfigurer) throws java.lang.IllegalArgumentException {
    super.configurePipeline(pipelineConfigurer);
    init(pipelineConfigurer.getStageConfigurer().getInputSchema());
    co.cask.cdap.api.data.schema.Schema outputSchema = null;
    if ((pipelineConfigurer.getStageConfigurer().getInputSchema()) != null) {
        outputSchema = getOutputSchema(pipelineConfigurer.getStageConfigurer().getInputSchema());
    }
    pipelineConfigurer.getStageConfigurer().setOutputSchema(outputSchema);
}