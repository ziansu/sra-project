@javax.ws.rs.GET
@javax.ws.rs.Path(value = "getBlankSlate")
public javax.ws.rs.core.Response getBlankSlate(@javax.ws.rs.QueryParam(value = "riddleID")
long riddleID) {
    org.hibernate.Session ses = test.transactions.util.TransUtil.enterTransaction();
    boolean riddleExists = test.transactions.util.riddleRhyme.rhymeRiddle.riddle.RiddleTransUtil.doesRiddleExist(riddleID);
    test.dbDataAbstractions.fracturedTypes.clientServerConversation.lectern.Slate s;
    if (riddleExists) {
        s = test.dbDataAbstractions.fracturedTypes.clientServerConversation.lectern.Slate.makeBlankSlate(riddleID);
    }else {
        s = test.dbDataAbstractions.fracturedTypes.clientServerConversation.lectern.Slate.makeErrorSlate(riddleID);
    }
    if (null == s) {
        throw new test.MyError("how did s become null??");
    }
    test.transactions.util.TransUtil.exitTransaction(ses, TransUtil.EXIT_NO_SAVING);
    return utils.JSONUtil.fracturedTypeToJSONResponse(s);
}