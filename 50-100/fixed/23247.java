@java.lang.Override
public void onCheckedChanged(com.kiddos.buslightyear.bus.RadioGroup group, int checkId) {
    switch (group.getCheckedRadioButtonId()) {
        case R.id.rbStation1 :
            if ((adapter) != null) {
                adapter.update(com.kiddos.buslightyear.bus.BusRouteInfoFragment.GOBACK_FALSE);
                adapter.notifyDataSetChanged();
            }
            break;
        case R.id.rbStation2 :
            if ((adapter) != null) {
                adapter.update(com.kiddos.buslightyear.bus.BusRouteInfoFragment.GOBACK_TRUE);
                adapter.notifyDataSetChanged();
            }
            break;
    }
}