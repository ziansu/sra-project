public void updatedSelectedItem(java.lang.Object o) {
    com.kimeeo.kandroid.sample.model.SampleModel data = ((com.kimeeo.kandroid.sample.model.SampleModel) (o));
    textView.setText(data.name);
    textView.setTextColor(textView.getContext().getResources().getColor(R.color.actionBarBackgroundStart));
}