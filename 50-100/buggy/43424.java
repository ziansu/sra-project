static view.View generateView(backend.Account userAccount, view.View theView) {
    if (userAccount instanceof backend.Volunteer) {
        theView = new view.VolunteerView();
    }else
        if (userAccount instanceof backend.ParkManager) {
            theView = new view.ParkManagerView(userAccount, view.Main.datastore);
        }else
            if (userAccount instanceof backend.OfficeStaff) {
                theView = new view.OfficeStaffView(userAccount, view.Main.datastore);
            }else {
                throw new java.lang.NullPointerException("Account not found.");
            }
        
    
    return theView;
}