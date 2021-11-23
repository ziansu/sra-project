public static void closeSession() {
    cz.tul.dic.CsvOutput.outputters.values().stream().forEach(( m) -> {
        m.values().stream().forEach(( out) -> {
            out.closeWriter();
        });
    });
    cz.tul.dic.CsvOutput.outputters.clear();
}