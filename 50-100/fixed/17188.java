@butterknife.OnClick(value = R.id.remove)
public void remove() {
    if ((task) != null) {
        task.remove();
        task = null;
    }
    downloadSize.setText("--M/--M");
    netSpeed.setText("---/s");
    tvProgress.setText("--.--%");
    pbProgress.setProgress(0);
    download.setText("下载");
}