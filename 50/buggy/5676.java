@java.lang.Override
public void update() {
    total.clear();
    java.util.ArrayList<java.lang.String> total = claim.getTotal();
    totalAdapter.notifyDataSetChanged();
}