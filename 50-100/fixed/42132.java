private java.util.ArrayList<com.mdsgpp.cidadedemocratica.model.Tag> getTagginsList() {
    com.mdsgpp.cidadedemocratica.persistence.DataContainer dataContainer = com.mdsgpp.cidadedemocratica.persistence.DataContainer.getInstance();
    android.content.Intent i = getIntent();
    long proposalId = i.getLongExtra("ProposalID", 0);
    com.mdsgpp.cidadedemocratica.model.Proposal proposal = dataContainer.getProposalForId(proposalId);
    return proposal.getTags();
}