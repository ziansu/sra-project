@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(getActivity(), cn.mcavoy.www.subwayticket.StationListActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt("chooseType", 0);
    intent.putExtras(bundle);
    startActivityForResult(intent, 0);
}