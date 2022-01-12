public void setStop(java.lang.Boolean aBool) {
    if (aBool) {
        double distanceX = (pinionModel.centerCoodinate().x) - (spurModel.centerCoodinate().x);
        double distanceY = (pinionModel.centerCoodinate().y) - (spurModel.centerCoodinate().y);
        gearDistance = java.lang.Math.sqrt(((distanceX * distanceX) + (distanceY * distanceY)));
        pinionModel.dataReset();
        spurModel.dataReset();
    }
    isStop = aBool;
    return ;
}