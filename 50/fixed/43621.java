public void checkForCancel() throws jloda.util.CanceledException {
    if (this.userCancelled) {
        if (closeOnCancel)
            close();
        
        throw new jloda.util.CanceledException();
    }else
        checkTimeAndShow();
    
}