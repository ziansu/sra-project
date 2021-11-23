public java.lang.String getOutPath() {
    if (!(commandLine.hasOption("outpath"))) {
        return commandLine.getOptionValue("path");
    }else {
        return commandLine.getOptionValue("outpath");
    }
}