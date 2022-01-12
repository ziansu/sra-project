public void keyPressed() {
    if ((key) == 'm')
        mirrorsOn = !(mirrorsOn);
    else
        if ((key) == 'e')
            background(0);
        else
            if (((key) == '+') && ((verticalE) < 1))
                verticalE += 0.1F;
            else
                if (((key) == '-') && ((verticalE) > (-1)))
                    verticalE -= 0.1F;
                
            
        
    
}