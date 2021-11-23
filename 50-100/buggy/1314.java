public static void main(java.lang.String[] args) {
    java.lang.String treeLocation = null;
    java.lang.String baseFolder = null;
    java.lang.String csv = null;
    if ((args.length) > 3) {
        treeLocation = args[0];
        baseFolder = args[1];
        csv = args[2];
    }else {
        java.lang.System.err.println("java -jar CreateCsv.jar phylo.tree baseFolder csvFile");
        java.lang.System.exit(0);
    }
    be.kuleuven.rega.phylogeotool.tools.AddCsvInfo addCsvInfo = new be.kuleuven.rega.phylogeotool.tools.AddCsvInfo();
    addCsvInfo.run(treeLocation, baseFolder, csv);
}