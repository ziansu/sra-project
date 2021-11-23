@java.lang.Override
public void onClick(android.view.View view) {
    com.aseupc.flattitude.Activities.InvitationDetails.callRespondInvitation callA = new com.aseupc.flattitude.Activities.InvitationDetails.callRespondInvitation();
    callA.execute(userID, flatID, "true");
}