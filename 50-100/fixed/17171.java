@java.lang.Override
public void display(rddl.State s, int time) {
    java.lang.String vector = getStateDescription(s);
    if ((_bSuppressWriteFile) == true) {
        if ((_bSuppressActionFluents) == true) {
            _pLabelOut.println(vector);
        }else {
            java.lang.String reward = getReward(s);
            java.lang.System.out.println(reward);
            _pRewardOut.println(reward);
            _pDataOut.println(vector);
        }
    }
}