public void toggleTv(android.view.View view) {
    android.widget.ImageButton tvButton = ((android.widget.ImageButton) (findViewById(R.id.tv_onoff)));
    if (tvButton != null) {
        if (tv.getOnOffControl().isOn()) {
            tvButton.setImageResource(R.drawable.tv_transparent_s_off);
            tv.getOnOffControl().turnOff();
        }else {
            tvButton.setImageResource(R.drawable.tv_transparent_s_on);
            tv.getOnOffControl().turnOn();
        }
    }
}