@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gamercompanion.src.utils.tryUtil.Try<gamercompanion.src.utils.Unit> tryLayout = drawGamerCompanionInterface();
    if (!(tryLayout.isSuccess())) {
        showWarning(tryLayout.failure().getMessage());
    }
}