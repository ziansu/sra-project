public void setRating(int ratingNew) {
    if ((ratingNew > 5) || (ratingNew < 0))
        return ;
    
    (this.numUsersRated)++;
    this.rating = (((rating) * (numUsersRated)) + ratingNew) / ((numUsersRated) + 1);
}