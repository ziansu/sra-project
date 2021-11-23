@java.lang.Override
protected void onPostExecute(java.util.ArrayList<ir.rasen.charsoo.controller.object.Comment> result) {
    try {
        if (((serverAnswer) == null) || (result == null)) {
            delegate.getError(reqCode, ServerAnswer.EXECUTION_ERROR, ir.rasen.charsoo.model.comment.GetPostAllComments.TAG);
            return ;
        }
        if (serverAnswer.getSuccessStatus())
            delegate.getResult(reqCode, result);
        else
            delegate.getError(reqCode, serverAnswer.getErrorCode(), ir.rasen.charsoo.model.comment.GetPostAllComments.TAG);
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}