@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    try {
        if ((serverAnswer) == null) {
            delegate.failAddReview(ServerAnswer.EXECUTION_ERROR, ir.rasen.charsoo.model.review.ReviewBusiness.TAG);
            return ;
        }
        if (serverAnswer.getSuccessStatus())
            delegate.successAddReview(review, rate);
        else
            delegate.failAddReview(serverAnswer.getErrorCode(), ir.rasen.charsoo.model.review.ReviewBusiness.TAG);
        
    } catch (java.lang.Exception e) {
    }
}