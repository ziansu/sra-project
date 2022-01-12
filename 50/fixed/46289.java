public void parse(org.sakaiproject.util.archiver.Archiver archiver) throws java.lang.Exception {
    setArchiver(archiver);
    msg(("Parsing tool:  " + (getToolName())));
    parse();
}