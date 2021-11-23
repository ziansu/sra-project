@java.lang.Override
public void changeInput(org.ggp.base.util.propnet.polymorphic.tristate.Tristate xiNewValue, int xiTurn) {
    if (((mState[xiTurn].mValue) == (Tristate.UNKNOWN)) && (xiTurn < 2)) {
        mState[xiTurn].mValue = xiNewValue;
        propagateOutput(xiTurn, true);
    }
}