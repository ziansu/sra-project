public void setEnhancement(int enhancement) {
    if (enhancement == 0) {
        setHitBonus(1);
        setDmgBonus(0);
    }else
        if (enhancement == (-1)) {
            setHitBonus(0);
            setDmgBonus(0);
        }
    
    setHitBonus(enhancement);
    setDmgBonus(enhancement);
}