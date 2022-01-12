@java.lang.Override
public void onClick(android.view.View view) {
    int color = colorSpinner.getSelectedItemPosition();
    setColor(color, imageButton);
    if (imageButton == (firstColor))
        firstValue = color;
    else
        if (imageButton == (secondColor))
            secondValue = color;
        else
            if (imageButton == (thirdColor))
                thirdValue = color;
            else
                if (imageButton == (fourthColor))
                    fourthValue = color;
                else
                    if (imageButton == (toleranceColor))
                        toleranceValue = color;
                    
                
            
        
    
    alertDialog.dismiss();
}