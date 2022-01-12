@java.lang.Override
public void processFinish(java.lang.String output) {
    java.lang.System.out.println(output);
    if (output.equals("Success ")) {
        working.setTextColor(Color.GREEN);
        working.setText("Clocked in Succesfully");
        sendNotification();
    }else
        if (output.equals("Failure ")) {
            working.setTextColor(Color.RED);
            working.setText("You can't clock in again");
        }
    
}