private void maskView(int count) {
    if (count > (net.redbear.redbear8nanos.ControlActivity.MAX_DEVICES_NUM))
        return ;
    
    for (int i = 0; i < (net.redbear.redbear8nanos.ControlActivity.MAX_DEVICES_NUM); i++) {
        if (i >= count) {
            nanos.get(i).setVisibility(View.INVISIBLE);
        }else {
            nanos.get(i).setVisibility(View.VISIBLE);
        }
    }
}