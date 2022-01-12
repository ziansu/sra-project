@java.lang.Override
public void onReceive(final android.content.Context context, final android.content.Intent intent) {
    final java.lang.String action = intent.getAction();
    final boolean prevUseHeadset = james.dsp.service.HeadsetService.mUseHeadset;
    if (action.equals(AudioManager.ACTION_HEADSET_PLUG))
        james.dsp.service.HeadsetService.mUseHeadset = (intent.getIntExtra("state", 0)) == 1;
    
    if (prevUseHeadset != (james.dsp.service.HeadsetService.mUseHeadset))
        updateDsp(true);
    
}