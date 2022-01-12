public java.lang.String GoodoBad(java.lang.String mob) {
    mob = mob.substring(0, ((mob.length()) - 1));
    if ((FindT(mob, super.goodMobs)) > (-1)) {
        return "good";
    }else
        if ((FindT(mob, super.badMobs)) > (-1)) {
            return "bad";
        }else {
            return "not a good or bad mob";
        }
    
}