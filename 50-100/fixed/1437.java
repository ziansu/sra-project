@java.lang.Override
public void configurePipeline(co.cask.cdap.etl.api.PipelineConfigurer pipelineConfigurer) throws java.lang.IllegalArgumentException {
    super.configurePipeline(pipelineConfigurer);
    if ((config.schema) != null) {
        pipelineConfigurer.getStageConfigurer().setOutputSchema(parseJson(config.schema));
    }else {
        pipelineConfigurer.getStageConfigurer().setOutputSchema(pipelineConfigurer.getStageConfigurer().getInputSchema());
    }
}