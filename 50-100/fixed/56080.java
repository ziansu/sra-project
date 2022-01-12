@java.lang.Override
public boolean onMessage(za.ttd.characters.BadBreath badBreath, com.badlogic.gdx.ai.msg.Telegram telegram) {
    boolean status = super.onMessage(badBreath, telegram);
    if (!status) {
        switch (telegram.message) {
            case MessageType.MOUTHWASH_EXPIRED :
                badBreath.getBadBreathStateMachine().revertToPreviousState();
                return true;
        }
    }
    return status;
}