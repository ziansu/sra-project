public void test(android.view.View view) {
    com.hypodiabetic.happ.Objects.TempBasal example = new com.hypodiabetic.happ.Objects.TempBasal();
    example.rate = 5.0;
    example.duration = 30;
    pumpAction.newTempBasal(example, view.getContext());
}