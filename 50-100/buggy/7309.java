@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    try {
        releasePlayer();
        cg.stevendende.deliciousrecipes.ui.StepDetailsFragment.mMediaSession.setActive(false);
    } catch (java.lang.NullPointerException exception) {
        exception.printStackTrace();
    } catch (java.lang.Exception ex) {
        android.util.Log.e("BALog", ("exolayer unlnown bug --- " + (ex.getMessage())));
    }
}