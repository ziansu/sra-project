@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case os.ransj.thundership.actions.BattleActor.MSG_ID_IMAGE :
            mIsIdle = true;
            android.graphics.Bitmap image = ((android.graphics.Bitmap) (msg.obj));
            msg.obj = null;
            inspectBattle(image);
            break;
        case os.ransj.thundership.actions.BattleActor.MSG_ID_ININT :
            init();
            break;
    }
    return true;
}