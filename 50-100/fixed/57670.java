public void selectBlackList(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.cr0mbly.blueWatch.Intents.InstalledPackages.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable("loadedBlacklist", blacklist);
    intent.putExtras(bundle);
    startActivityForResult(intent, com.cr0mbly.blueWatch.Intents.BluetoothActivity.BLACKLISTCODE);
}