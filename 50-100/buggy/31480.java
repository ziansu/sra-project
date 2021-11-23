boolean isValid() {
    int[] validHighScores = new int[]{ 180 , 177 , 174 , 171 , 170 , 168 , 167 , 165 , 164 };
    if ((org.apache.commons.lang3.ArrayUtils.contains(validHighScores, this.score)) || ((this.score) < 163)) {
        return true;
    }else {
        return false;
    }
}