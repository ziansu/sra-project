@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    if (actionEvent.getActionCommand().equals("Create Advert")) {
        inputAdvertInfo();
    }else
        if (actionEvent.getActionCommand().equals("Amend Advert")) {
            getAndAmendInfo();
        }else
            if (actionEvent.getActionCommand().equals("Delete Advert")) {
                getAndAmendInfo();
                deleteAdvert();
            }else
                if (actionEvent.getActionCommand().equals("Display Advert")) {
                    displayAdvert();
                }
            
        
    
}