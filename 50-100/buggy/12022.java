public void print(int copies) {
    java.lang.String onStatus = "";
    if (isOn)
        onStatus = " is on!";
    else
        onStatus = " is off!";
    
    java.lang.String textToPrint = (modelNumber) + onStatus;
    while ((copies > 0) && (!(paperTray.isEmpty()))) {
        java.lang.System.out.println(textToPrint);
        copies--;
        paperTray.usePage();
    } 
    if (paperTray.isEmpty())
        java.lang.System.out.println("Load more paper");
    
}