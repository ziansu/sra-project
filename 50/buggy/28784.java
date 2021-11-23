private void unregisterReceiver() {
    unregisterReceiver(com.company.mbelogorodtsev.trainingapplication.MusicManager.getInstance().getReceiverDownloadComplete());
}