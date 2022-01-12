@java.lang.Override
public void configurePipeline(co.cask.cdap.etl.api.PipelineConfigurer pipelineConfigurer) throws java.lang.IllegalArgumentException {
    super.configurePipeline(pipelineConfigurer);
    if ((config.schema) != null) {
        try {
            pipelineConfigurer.getStageConfigurer().setOutputSchema(co.cask.cdap.api.data.schema.Schema.parseJson(config.schema));
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalArgumentException(("Unable to parse schema: " + (e.getMessage())), e);
        }
    }else {
        pipelineConfigurer.getStageConfigurer().setOutputSchema(pipelineConfigurer.getStageConfigurer().getInputSchema());
    }
}