@java.lang.Override
public synchronized int delCommentOnResource(int resourceCreatorID, int resourceID, int manipulationID) {
    transactionHelper.beginTransaction();
    try {
        transactionHelper.deleteManipulation(java.lang.String.valueOf(resourceID), java.lang.String.valueOf(manipulationID));
    } catch (TestDS.NotFoundException e) {
        transactionHelper.endTransaction();
        e.printStackTrace();
        return -1;
    }
    transactionHelper.endTransaction();
    return 0;
}