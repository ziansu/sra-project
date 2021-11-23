public static void calculateOutPut() {
    java.lang.System.out.println("Please enter item number");
    item = input.nextInt();
    if ((item) < (LOW))
        output = "Item number too low";
    else
        if ((item) > (HIGH))
            output = "Item number too high";
        else
            if ((item) > (CUTOFF))
                output = "Valid - in Automotive Department";
            else
                output = "Valid - Item in Housewares Department";
            
        
    
    java.lang.System.out.println(output);
}