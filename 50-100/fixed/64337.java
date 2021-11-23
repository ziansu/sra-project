@java.lang.Override
public void onRatingChanged(android.widget.RatingBar ratingBar, float rating, boolean fromUser) {
    int tag = ((java.lang.Integer) (ratingBar.getTag())).intValue();
    if (tag == 0) {
        totalScore = ((int) (rating));
    }else
        if (tag == 1) {
            teacherScore = ((int) (rating));
        }else {
            envScore = ((int) (rating));
        }
    
}