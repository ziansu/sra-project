@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    vals = ((java.util.HashMap<java.lang.String, java.lang.Integer>) (snapshot.child("values").getValue(new com.firebase.client.GenericTypeIndicator<java.util.HashMap<java.lang.String, java.lang.Integer>>() {    })));
    java.lang.String proposer_index = ((java.lang.Integer) (vals.get("proposer_index"))).toString();
    playerName = ((com.example.isaacwang.stazo_resistance.Player) (snapshot.child("players").child(proposer_index).getValue())).getName();
}