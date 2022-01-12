@java.lang.Override
public void showBottomSheet(com.cloudcontact.cloudcontact.Parse.ParseRow parseRow) {
    if ((bottomSheet) == null)
        bottomSheet = new com.cloudcontact.cloudcontact.BottomSheet.BottomSheet(this, parseRow);
    else
        if (!(bottomSheet.isShowing()))
            bottomSheet.show();
        
    
}