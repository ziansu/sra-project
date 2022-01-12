@java.lang.Override
protected org.apache.commons.cli.Options getOptions() {
    org.apache.commons.cli.Options opts = new org.apache.commons.cli.Options();
    opts.addOption("bitset", "bitset_input", false, "Use Bitset for the input of pos_items [default:false]");
    opts.addOption("sampling", "sampling_rate", true, "Sampling rates of positive items [default: 1.0]");
    opts.addOption("with_replacement", false, "Do sampling with-replacement [default: false]");
    return opts;
}