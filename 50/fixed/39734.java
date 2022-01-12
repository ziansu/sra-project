protected void bulkLoadGraphOfTheGods(final com.thinkaurelius.titan.hadoop.formats.HadoopGraph f) throws java.lang.Exception {
    new com.thinkaurelius.titan.hadoop.formats.HadoopPipeline(f)._().submit();
}