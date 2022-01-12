private java.lang.String getChromosomalChange(org.apache.commons.csv.CSVRecord record) {
    return (((((record.get(options.getChr())) + ":") + (record.get(options.getPos()))) + (record.get(options.getRef()))) + ">") + (record.get(options.getAlt()));
}