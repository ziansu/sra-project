@java.lang.Override
public void onRewardedVideoFinished(int amount, java.lang.String name) {
    showToastOnTesting(java.lang.String.format("onRewardedVideoFinished. Reward: %d %s", amount, name));
    org.godotengine.godot.GodotLib.calldeferred(instanceId, "_on_rewarded_video_finished", new java.lang.Object[]{ amount , name });
}