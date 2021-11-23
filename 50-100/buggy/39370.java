public int getAction(java.lang.Object caller) {
    if ((ifLoaded) == false) {
        ifLoaded = true;
        return 0;
    }else {
        int randNumber = ((int) ((java.lang.Math.floor(((java.lang.Math.random()) * 2))) + 1));
        if (randNumber == 1) {
            return 1;
        }else {
            ifLoaded = false;
            return 2;
        }
    }
}