@java.lang.Override
public boolean isDirty(com.playposse.peertopeeroxygen.backend.peerToPeerOxygenApi.model.MissionBean missionBean) {
    if ((buddyInstructionEditText) == null) {
        return false;
    }else
        if (missionBean == null) {
            return false;
        }else {
            return !(buddyInstructionEditText.getText().toString().equals(missionBean.getBuddyInstruction()));
        }
    
}