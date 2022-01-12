public void changeFocus(android.view.View v) {
    if (digitRB.isChecked())
        selectedType = LabelManager.LabelTypeEnum.DIGITS;
    else
        if (letterRB.isChecked())
            selectedType = LabelManager.LabelTypeEnum.LETTERS;
        else
            if (capitalRB.isChecked())
                selectedType = LabelManager.LabelTypeEnum.CAPITAL;
            else
                if (imageRB.isChecked())
                    selectedType = LabelManager.LabelTypeEnum.IMAGES;
                
            
        
    
    classTypeEB.requestFocus();
}