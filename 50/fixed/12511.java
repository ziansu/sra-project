@java.lang.Override
public void onRewardedVideoFinished(int amount, java.lang.String name) {
    showToastOnTesting(java.lang.String.format("onRewardedVideoFinished. Reward: %d %s", amount, name));
}