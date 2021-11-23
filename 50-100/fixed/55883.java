public void runConversion(java.lang.String inputfile, java.lang.String outputfilename) {
    ch.so.agi.avgbs2mtab.mutdat.ParcelContainer parceldump = new ch.so.agi.avgbs2mtab.mutdat.ParcelContainer();
    ch.so.agi.avgbs2mtab.mutdat.DPRContainer dprdump = new ch.so.agi.avgbs2mtab.mutdat.DPRContainer();
    ch.so.agi.avgbs2mtab.writeexcel.XlsxWriter xlsxWriter = new ch.so.agi.avgbs2mtab.writeexcel.XlsxWriter();
    ch.so.agi.avgbs2mtab.readxtf.ReadXtf xtfreader = new ch.so.agi.avgbs2mtab.readxtf.ReadXtf(parceldump, dprdump, parceldump);
    xtfreader.readFile(inputfile);
    xlsxWriter.writeXlsx(outputfilename);
}