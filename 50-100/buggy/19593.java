void commit() {
    if (!(attList.hasOption("autowidth"))) {
        double width = 100.0 / (count);
        fr.icodem.asciidoc.parser.peg.example.asciidoc.listener.BlockListenerDelegate.ColumnContext col = rootColumn;
        for (int i = 0; i < (count); i++) {
            col.width = width;
            col = col.next;
        }
    }
}