@java.lang.Override
public void onPause() {
    android.content.Intent toService = new android.content.Intent(this, io.github.mthli.Ninja.Service.HolderService.class);
    io.github.mthli.Ninja.Unit.IntentUnit.setClear(false);
    stopService(toService);
    create = false;
    inputBox.clearFocus();
    super.onPause();
}