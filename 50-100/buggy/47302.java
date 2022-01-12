@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_edit_claim);
    blainelewis1.cmput301assignment1.ClaimManager claimManager = blainelewis1.cmput301assignment1.ClaimManager.getInstance();
    claim = claimManager.extractClaim(savedInstanceState, getIntent());
    isNew = claimManager.extractIsNew(savedInstanceState, getIntent());
    findViewsByIds();
    initViews();
    setListeners();
    validate();
}