@java.lang.Override
public void processFinish(java.lang.String output) {
    java.lang.System.out.println(output);
    if (output.equals("Success ")) {
        working.setTextColor(Color.GREEN);
        working.setText("Clocked out Succesfully");
        pay.setText(("Payment: €" + totalstr));
    }else
        if (output.equals("Failure ")) {
            working.setTextColor(Color.RED);
            working.setText("Please try again");
        }
    
}