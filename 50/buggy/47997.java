@com.drfits.annotation.RunMethod
public void execute(com.drfits.transfer.Transfer transfer) {
    java.lang.String msg;
    if (transfer != null) {
        msg = "Execute data: " + (transfer.getData());
    }else {
        msg = "transfer object is null";
    }
    java.lang.System.out.println(msg);
}