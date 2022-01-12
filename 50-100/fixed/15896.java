@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    int dateOffset = position * (-1);
    br.com.dgimenes.nasapic.fragment.SinglePictureFragment fragment = new br.com.dgimenes.nasapic.fragment.SinglePictureFragment();
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.add(java.util.Calendar.DAY_OF_MONTH, dateOffset);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putLong(SinglePictureFragment.DATE_PARAM, calendar.getTime().getTime());
    fragment.setArguments(bundle);
    fragmentPerPosition.put(position, fragment);
    return fragment;
}