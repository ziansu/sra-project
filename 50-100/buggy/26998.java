public java.lang.String GoodoBad(java.lang.String mob) {
    if ((FindT(mob, super.goodMobs)) > (-1)) {
        return "good";
    }else
        if ((FindT(mob, super.badMobs)) > (-1)) {
            return "bad";
        }else {
            return "not a good or bad mob";
        }
    
}