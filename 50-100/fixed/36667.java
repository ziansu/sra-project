@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    try {
        if ((serverAnswer) == null) {
            delegate.failAddReview(ServerAnswer.EXECUTION_ERROR, ir.rasen.charsoo.model.review.ReviewBusiness.TAG);
            return ;
        }
        if (serverAnswer.getSuccessStatus())
            if (result)
                delegate.successAddReview(review, rate);
            else
                delegate.failAddReview(serverAnswer.getErrorCode(), ir.rasen.charsoo.model.review.ReviewBusiness.TAG);
            
        else
            delegate.failAddReview(serverAnswer.getErrorCode(), ir.rasen.charsoo.model.review.ReviewBusiness.TAG);
        
    } catch (java.lang.Exception e) {
    }
}