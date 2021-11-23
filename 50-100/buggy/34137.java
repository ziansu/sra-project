private void setUserStarImage(android.widget.ImageButton starButton, int stars) {
    switch (stars) {
        case 1 :
            starButton.setImageResource(R.drawable.called);
            break;
        case 2 :
            starButton.setImageResource(R.drawable.zero_star);
            break;
        case 3 :
            starButton.setImageResource(R.drawable.one_star);
            break;
        case 4 :
            starButton.setImageResource(R.drawable.two_star);
            break;
        case 5 :
            starButton.setImageResource(R.drawable.three_star);
            break;
    }
}