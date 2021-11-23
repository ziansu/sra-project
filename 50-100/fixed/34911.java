private java.util.function.Consumer<de.ovgu.skunk.commitanalysis.FunctionChangeHunk> newThreadSafeFunctionToCsvWriter(final org.apache.commons.csv.CSVPrinter csv, final de.ovgu.skunk.detection.output.CsvRowProvider<de.ovgu.skunk.commitanalysis.FunctionChangeHunk, de.ovgu.skunk.bugs.correlate.data.Snapshot, de.ovgu.skunk.commitanalysis.FunctionChangeHunksColumns> csvRowProvider) {
    return ( functionChange) -> {
        java.lang.Object[] rowForFunc = csvRowProvider.dataRow(functionChange);
        try {
            synchronized(csv) {
                csv.printRecord(rowForFunc);
            }
        } catch (java.io.IOException ioe) {
            throw new java.lang.RuntimeException(("IOException while writing row for changed function " + functionChange), ioe);
        }
    };
}