@java.lang.Override
public void run() {
    while ((progressBarStatus) < 100) {
        progressBarStatus = counter;
        counter += 1;
        try {
            java.lang.Thread.sleep(30);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        progressBarHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mProgressDialog.setProgress(progressBarStatus);
            }
        });
    } 
    if ((progressBarStatus) >= 100)
        return ;
    
}