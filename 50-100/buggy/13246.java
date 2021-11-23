public void setHP(java.lang.Double HP) {
    if (HP <= 10.0) {
        this.HP = HP;
    }else
        if (HP <= 0) {
            this.HP = 0;
        }else
            if (HP > 10) {
                this.HP = 10;
            }
        
    
}