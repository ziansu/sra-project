private void updateStatus() {
    piranha.llp2st.data.Downloads.Status status = piranha.llp2st.data.Downloads.getStatus(id);
    switch (status) {
        case None :
            downloadButton.onProgressCompleted();
            downloadButton.resetIcon();
            break;
        case InProgress :
            downloadButton.showProgress(true);
            break;
        case Done :
            downloadButton.onProgressCompleted();
            break;
    }
}