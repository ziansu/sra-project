public void run() {
    int type;
    int size;
    byte[] buff;
    while (isRun) {
        try {
            buff = buffList.take();
            if ((buff.length) > 0) {
                if ((status) == 0) {
                    processHead(buff);
                    status = 1;
                }else
                    if ((status) == 1) {
                        processBody(buff);
                        status = 0;
                    }
                
            }
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    } 
}