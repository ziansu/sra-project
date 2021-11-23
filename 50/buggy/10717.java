@java.lang.Override
public void onPause() {
    super.onPause();
    com.example.nicco.inspectionReviewManager.customDatatypes.Model model = ((com.example.nicco.inspectionReviewManager.customDatatypes.Model) (getApplicationContext()));
    model.reset();
}