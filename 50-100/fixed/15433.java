public void setEnhancement(int enhancement) {
    setHitBonus(enhancement);
    setDmgBonus(enhancement);
    if (enhancement == 0) {
        setHitBonus(1);
        setDmgBonus(0);
    }else
        if (enhancement == (-1)) {
            setHitBonus(0);
            setDmgBonus(0);
        }
    
}