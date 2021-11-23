@java.lang.Override
public void onClick(android.view.View view) {
    int color = colorSpinner.getSelectedItemPosition();
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
                
            
        
    
    setColor(color, imageButton);
    alertDialog.dismiss();
}