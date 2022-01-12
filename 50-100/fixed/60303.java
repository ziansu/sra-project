@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String status = ca.ualberta.cs.travelapp.ClaimListController.getClaimList().getClaims().get(index).getStatus().trim();
    if ((status.equals("In Progress")) || (status.equals("Returned"))) {
        try {
            editClaimAction(v);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }else {
        onlyStatus(v);
    }
}