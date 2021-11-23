@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    com.gigigo.ggglogger.GGGLogImpl.log("CloudRecognitionActivityLifeCycleCallBack.onActivityResumed");
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Resume();
    
}