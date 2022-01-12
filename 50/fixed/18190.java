public void onRestoreInstanceState(@android.support.annotation.Nullable
android.os.Bundle outState) {
    if ((outState != null) && (outState.containsKey("image_pick_request_code"))) {
        mRequestCode = outState.getInt("image_pick_request_code");
    }
}