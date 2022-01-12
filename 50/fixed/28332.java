public static void main(java.lang.String[] args) {
    edu.pse.beast.highlevel.BEASTCommunicator communicator = new edu.pse.beast.highlevel.BEASTCommunicator();
    edu.pse.beast.highlevel.PSECentralObjectProvider centralObjectProvider = new edu.pse.beast.highlevel.PSECentralObjectProvider(communicator);
    communicator.setCentralObjectProvider(centralObjectProvider);
    new edu.pse.beast.electionSimulator.ElectionSimulation(centralObjectProvider);
}