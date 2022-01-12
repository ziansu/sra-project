@java.lang.Override
public void display(rddl.State s, int time) {
    java.lang.String vector = getStateDescription(s);
    if ((_bSuppressWriteFile) == true) {
        if ((_bSuppressActionFluents) == true) {
            java.lang.String reward = getReward(s);
            java.lang.System.out.println(reward);
            _pLabelOut.println(vector);
            _pRewardOut.println(reward);
        }else {
            _pDataOut.println(vector);
        }
    }
}