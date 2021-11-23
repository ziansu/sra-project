@java.lang.Override
public void onUpdate(final com.jfixby.r3.api.ui.unit.update.UnitClocks unit_clock) {
    this.touchCurrentTime = com.jfixby.cmns.api.sys.Sys.SystemTime().currentTimeMillis();
    if (!(this.pressed)) {
        return ;
    }
    if ((this.touchCurrentTime) < (this.touchLongTap)) {
        return ;
    }else {
        this.pressed = false;
        TelecamUIAction.switchToVideoShoot.push();
        TelecamUIAction.goVideoRecording.push();
        TelecamUIAction.doRecordVideo.push();
    }
}