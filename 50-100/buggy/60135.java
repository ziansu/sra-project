@org.springframework.shell.core.annotation.CliCommand(value = { "overlapGraph" }, help = "Solve the Overlap Graph Problem")
public java.lang.String overlapGraph(@org.springframework.shell.core.annotation.CliOption(key = { "kmersFileName" }, mandatory = true, help = "File contains of a collection patterns of k-mers")
java.lang.String kmersFileName, @org.springframework.shell.core.annotation.CliOption(key = { "outputFileName" }, mandatory = true, help = "File name contains the overlap graph Overlap(Patterns), in the form of an adjacency list")
java.lang.String outputFileName) {
    try {
        java.util.List<java.lang.String> list = com.gmail.volodymyrdotsenko.javabio.cli.utils.FileUtils.getListFromFile(kmersFileName);
        saveTextFile(outputFileName, com.gmail.volodymyrdotsenko.javabio.simple.SequencesUtil.overlapGraph(list.toArray(new java.lang.String[list.size()])).toString());
        return ("File " + outputFileName) + " created!";
    } catch (java.io.IOException e) {
        com.gmail.volodymyrdotsenko.javabio.cli.commands.SequencesCommander.LOGGER.severe(e.getMessage());
    }
    return "Error creating a file";
}