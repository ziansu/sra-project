@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        if (((boolean) (dataSnapshot.getValue()))) {
            fbRefWaitingTime.removeEventListener(waitingTimeListener);
            fbRefQueueTurn.removeEventListener(queueTurnListener);
            waitingTime_TV.setText("Your turn's up!");
            refresh_btn.setVisibility(View.INVISIBLE);
            claim_btn.setVisibility(View.VISIBLE);
        }
    }
}