@java.lang.Override
public void run() {
    int i = 0;
    int j = 0;
    while (true) {
        if (i == 0) {
            visRep = visRep2;
            i++;
        }else {
            visRep = mouthClosedImage;
            i = 0;
        }
        try {
            java.lang.Thread.sleep(125);
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(e);
        }
    } 
}