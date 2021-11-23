@java.lang.Override
public void onPause() {
    super.onPause();
    operatingAnim.cancel();
    eye_left_Anim.cancel();
    eye_right_Anim.cancel();
    operatingAnim.reset();
    eye_left_Anim.reset();
    eye_right_Anim.reset();
    mouse.clearAnimation();
    eye_left.clearAnimation();
    eye_right.clearAnimation();
    eyelid_left.stopLoading();
    eyelid_right.stopLoading();
    mGraduallyTextView.stopLoading();
}