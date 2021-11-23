public boolean EditingOSC(int num) {
    if ((edit_osc.length) <= num)
        return false;
    
    return (edit_osc[num].value) == 1;
}