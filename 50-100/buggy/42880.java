@java.lang.Override
public void onItemClick(com.huewu.pla.lib.internal.PLA_AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position < (mGridData.size())) {
        org.wheat.ranking.entity.BeautyIntroduction introduction = mGridData.get(position);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("mBeautyID", introduction.getBeautyId());
        intent.setClass(getActivity(), org.wheat.ranking.activity.BeautyPersonalPageActivity.class);
        startActivity(intent);
    }
}