private void updateReadingSurface() {
    android.widget.TextView readingPane = ((android.widget.TextView) (this.getView().findViewById(R.id.reading_surface)));
    android.widget.TextView readingInfo = ((android.widget.TextView) (this.getView().findViewById(R.id.reading_info)));
    readingPane.setText(viewModel.getCurrentPage());
    readingInfo.setText(viewModel.getReadingInfo());
}