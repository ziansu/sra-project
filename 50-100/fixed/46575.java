private joptsimple.OptionParser getOptionParser() {
    joptsimple.OptionParser parser = new joptsimple.OptionParser();
    parser.accepts("unique-job-string", "A unique string that is attached to all jobs of interest.").withRequiredArg().isRequired();
    parser.acceptsAll(java.util.Arrays.asList("output-file", "o"), "A location for an output file describing the finished jobs").withRequiredArg();
    parser.acceptsAll(java.util.Arrays.asList("begin-time", "b"), "The earliest start time for jobs to be summarized, in the format [[CC]YY]MMDDhhmm[.SS]").withRequiredArg();
    return parser;
}