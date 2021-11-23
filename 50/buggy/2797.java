@java.lang.Override
public void onResume() {
    super.onResume();
    scaleViewModel.attach();
    fragmentScaleBinding.flScaleLeft.addView(sensorListLayout);
}