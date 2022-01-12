@java.lang.Override
public void update() {
    total = claim.getTotal();
    totalAdapter.notifyDataSetChanged();
}