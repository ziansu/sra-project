public static void main(java.lang.String[] args) {
    com.github.chrishantha.sample.highcpu.App app = new com.github.chrishantha.sample.highcpu.App();
    final com.beust.jcommander.JCommander jcmdr = new com.beust.jcommander.JCommander(app);
    jcmdr.setProgramName(com.github.chrishantha.sample.highcpu.App.class.getSimpleName());
    jcmdr.parse(args);
    if (app.help) {
        jcmdr.usage();
        return ;
    }
    app.start();
}