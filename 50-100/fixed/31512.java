private static void runBetaSelection(java.lang.String directory, java.lang.String betweennessScoreFile, java.lang.String influenceFile, edu.ohsu.hotnet2.BetaSelection bs, edu.ohsu.hotnet2.FileUtils fu) throws java.io.IOException {
    java.lang.System.out.println("Beta Selection using iRefIndex network");
    java.lang.String fiFile = "iref_edge_list";
    fiFile = fu.modifyEdgeFileToTabDelimited(directory, fiFile, false, " ");
    bs.selectBetaForIrefindex(directory, fiFile, betweennessScoreFile, influenceFile);
}