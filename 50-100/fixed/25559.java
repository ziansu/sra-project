@java.lang.Override
public void onMountainSelected(int position, java.lang.String mountain) {
    java.lang.String url = getMountainUrl(mountain);
    month = new ventureindustries.snowday.MonthOfSnow();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("mountain", url);
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    month.setArguments(args);
    transaction.replace(R.id.month_fragment_container, month);
    transaction.commit();
}