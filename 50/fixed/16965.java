@java.lang.Override
protected org.apache.commons.cli.Options getOptions() {
    org.apache.commons.cli.Options opts = new org.apache.commons.cli.Options();
    opts.addOption("bitset", "bitset_input", false, "Use Bitset for the input of pos_items [default:false]");
    return opts;
}