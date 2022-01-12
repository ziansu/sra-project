@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_proposals_list);
    proposalListView = ((android.widget.ListView) (findViewById(R.id.prosals_listID)));
    java.util.ArrayList<com.mdsgpp.cidadedemocratica.model.Proposal> proposalList = getProposalList();
    android.widget.ArrayAdapter<com.mdsgpp.cidadedemocratica.model.Proposal> proposalAdapter = new android.widget.ArrayAdapter<com.mdsgpp.cidadedemocratica.model.Proposal>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, proposalList);
    proposalListView.setAdapter(proposalAdapter);
}