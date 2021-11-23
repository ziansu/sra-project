@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    try {
        io.punchtime.punchtime.data.Pulse p = dataSnapshot.getChildren().iterator().next().getValue(io.punchtime.punchtime.data.Pulse.class);
        updateCheckinUI(p);
        if ((p.getCheckout()) == 0)
            setCheckedIn(true);
        else
            setCheckedIn(false);
        
    } catch (java.lang.Exception e) {
        updateCheckinUI(null);
        setCheckedIn(false);
    }
}