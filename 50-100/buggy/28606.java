public void addRating(java.lang.String demand, java.lang.Integer raiting) {
    for (int i = 0; i <= 5; i++) {
        if (Data[i][0].equals(demand)) {
            Data[i][1] = raiting.toString();
        }
        if ((Data[i][1]) == "") {
            Data[i][1] = "" + 0;
        }
    }
}