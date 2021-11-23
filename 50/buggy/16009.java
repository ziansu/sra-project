@java.lang.Override
public java.lang.Boolean pendingData(android.os.Bundle arg) throws java.lang.Exception {
    return au.com.pactera.pacterapulse.helper.NetworkHelper.postVote(vote, context);
}