@java.lang.Override
public void onTick(long millisUntilFinished) {
    cameraRunHandler.sendEmptyMessage(0);
    img_ac.setImageResource(com.ubicomp.ketdiary.TestActivity.ELECTRODE_RESOURCE[((ptr)++)]);
}