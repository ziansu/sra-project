@java.lang.Override
public void onClick(android.view.View view) {
    com.zai.nomwell.util.Util.log(com.zai.nomwell.fragments.MySpotFragment.TAG, "Clicked");
    switch (view.getId()) {
        case R.id.llShare :
            break;
        case R.id.llAddSpots :
            if (((rcvwSpots) != null) && ((rcvwSpots.getAdapter().getItemCount()) > 0)) {
                startActivity(new android.content.Intent(getActivity(), com.zai.nomwell.AddSpotsActivity.class));
            }else {
                showEmptyListDialog();
            }
            break;
        case R.id.llAddToLists :
            break;
    }
}