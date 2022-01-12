public static void initializePointer() {
    com.piuucseditor.Pointer.row = 1;
    com.piuucseditor.Chart.updatePointerView();
    com.piuucseditor.Pointer.updateTexts();
    android.widget.ScrollView scrollView = ((android.widget.ScrollView) (com.piuucseditor.Pointer.mainActivity.findViewById(R.id.rightScrollView)));
    scrollView.setVisibility(View.VISIBLE);
    com.piuucseditor.Pointer.isExisted = true;
    com.piuucseditor.Pointer.isLong = false;
}