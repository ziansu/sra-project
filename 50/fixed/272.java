@java.lang.Override
public void update() {
    total = Claim.getTotal();
    totalAdapter.notifyDataSetChanged();
}