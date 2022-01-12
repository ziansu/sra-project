public static void main(java.lang.String[] args) throws java.lang.Exception {
    if ((args.length) != 2) {
        java.lang.System.err.println("Enter valid number of arguments <Inputdirectory>  <Outputlocation>");
        java.lang.System.exit(0);
    }
    org.apache.hadoop.util.ToolRunner.run(new org.apache.hadoop.conf.Configuration(), new WhoToFollow(), args);
}