public void setAchievementImageBackground() {
    int rank = getAchievementRank();
    switch (rank) {
        case 1 :
            mainImageBackView.setImageResource(R.drawable.gold_wreath);
            break;
        case 2 :
            mainImageBackView.setImageResource(R.drawable.silver_wreath);
            break;
        case 3 :
            mainImageBackView.setImageResource(R.drawable.bronze_wreath);
            break;
        default :
            mainImageBackView.setImageResource(R.drawable.bronze_wreath);
            break;
    }
}