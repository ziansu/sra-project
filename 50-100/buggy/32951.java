public void resetIdentifierColumns() {
    int keggMetaboliteIdColumn = -1;
    edu.rutgers.MOST.config.LocalConfig.getInstance().setKeggMetaboliteIdColumn(keggMetaboliteIdColumn);
    int chebiIdColumn = -1;
    edu.rutgers.MOST.config.LocalConfig.getInstance().setChebiIdColumn(chebiIdColumn);
    int ecNumberColumn = -1;
    edu.rutgers.MOST.config.LocalConfig.getInstance().setEcNumberColumn(ecNumberColumn);
    int keggReactionIdColumn = -1;
    edu.rutgers.MOST.config.LocalConfig.getInstance().setKeggReactionIdColumn(keggReactionIdColumn);
}