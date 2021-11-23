public void refresh_order_detail(int orderNum) {
    android.os.Bundle b = new android.os.Bundle();
    b.putInt("orderNum", orderNum);
    com.pgroup.bartender.DetailOrderFragment fragment = new com.pgroup.bartender.DetailOrderFragment();
    fragment.setArguments(b);
    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).addToBackStack(null).commit();
}