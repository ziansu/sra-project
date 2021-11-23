@java.lang.Override
public void run() {
    while ((!(stop())) && ((getErrorAccout()) < 1)) {
        try {
            signer.sign(data);
            account(1, 0);
        } catch (java.lang.Exception ex) {
            account(1, 1);
        }
    } 
    close();
}