public void applyStrength(int strength) {
    this.strength = strength;
    if (strength == 0)
        strengthButton0.setSelected(true);
    else
        if (strength == 1)
            strengthButton1.setSelected(true);
        else
            if (strength == 2)
                strengthButton2.setSelected(true);
            else
                if (strength == 3)
                    strengthButton3.setSelected(true);
                else
                    if (strength == 4)
                        strengthButton4.setSelected(true);
                    else
                        strengthRadioGroup.clearSelection();
                    
                
            
        
    
}