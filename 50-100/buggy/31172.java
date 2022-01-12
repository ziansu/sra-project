private void resetFields() {
    title.setText("");
    locationAddress.setText("");
    city.setText("");
    startDate.setText(in.geobullet.csci_4176_project.CreateNewPoster.START_DATE);
    endDate.setText(in.geobullet.csci_4176_project.CreateNewPoster.END_DATE);
    startTime.setText(in.geobullet.csci_4176_project.CreateNewPoster.START_TIME);
    endTime.setText(in.geobullet.csci_4176_project.CreateNewPoster.END_TIME);
    details.setText("");
    imgSrc = "";
    previewImageView.setImageResource((-1));
}