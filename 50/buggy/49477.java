public void onFinish() {
    (segmentCount)++;
    toast();
    counting = false;
    total.setText(("Total Steps: " + ((int) (currentCount))));
}