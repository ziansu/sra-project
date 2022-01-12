public void startProcessorService() {
    com.njlabs.showjava.utils.Utils.killAllProcessorServices(this);
    android.content.Intent mServiceIntent = new android.content.Intent(getContext(), com.njlabs.showjava.processor.ProcessService.class);
    mServiceIntent.setAction(Constants.ACTION.START_PROCESS);
    mServiceIntent.putExtra("package_file_path", packageFilePath);
    mServiceIntent.putExtra("decompiler", decompilerToUse);
    startService(mServiceIntent);
}