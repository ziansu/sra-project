@java.lang.Override
public void update() {
    adapter.notifyDataSetChanged();
    ca.ualberta.CMPUT301W15T06.ClaimListManager.getInstance().save();
}