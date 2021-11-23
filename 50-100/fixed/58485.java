@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case CLASSIFICATION :
            java.lang.Integer soundLocation = soundCategorizer.categorizeSound(msg.arg1);
            soundManager.playSound(soundLocation);
            soundManager.addSoundToSequence(soundLocation);
            anim.setTarget(soundGridLayout.getChildAt(soundLocation));
            anim.start();
            return true;
        default :
            break;
    }
    return false;
}