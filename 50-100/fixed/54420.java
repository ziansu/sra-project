public org.springframework.batch.core.Job fromDccEurophenome() throws org.mousephenotype.cda.loads.exceptions.DataLoadException {
    org.springframework.batch.core.job.flow.Flow samplesFlow = new org.springframework.batch.core.job.builder.FlowBuilder<org.springframework.batch.core.job.flow.Flow>("samplesDccEurophenomeFlow").from(sampleDccEurophenomeLoader).end();
    org.springframework.batch.core.job.flow.Flow experimentsFlow = new org.springframework.batch.core.job.builder.FlowBuilder<org.springframework.batch.core.job.flow.Flow>("experimentsDccEurophenomeFlow").from(experimentDccEurophenomeLoader).end();
    return jobBuilderFactory.get("samplesJob").incrementer(new org.springframework.batch.core.launch.support.RunIdIncrementer()).start(experimentsFlow).end().build();
}