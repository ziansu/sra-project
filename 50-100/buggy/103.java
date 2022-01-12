@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    boolean result = com.igniva.indiecore.utils.Utility.checkPermission(this);
    if (items[item].equals("Take Photo")) {
        userChoosenTask = "Take Photo";
        if (result)
            cameraIntent();
        
    }else
        if (items[item].equals("Choose from Library")) {
            userChoosenTask = "Choose from Library";
            if (result)
                galleryIntent();
            
        }else
            if (items[item].equals("Cancel")) {
                dialog.dismiss();
            }
        
    
}