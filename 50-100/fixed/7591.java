@java.lang.Override
public void onItemSelected(java.lang.String ean) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(BookDetail.EAN_KEY, ean);
    it.jaschke.alexandria.BookDetail fragment = new it.jaschke.alexandria.BookDetail();
    fragment.setArguments(args);
    int id = R.id.container;
    if ((findViewById(R.id.right_container)) != null) {
        id = R.id.right_container;
    }
    getSupportFragmentManager().beginTransaction().replace(id, fragment).addToBackStack(null).commit();
}