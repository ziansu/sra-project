@java.lang.Override
public java.lang.String interpret(java.lang.String input) {
    if (input.equals("S\r\n")) {
        return "S S" + (getWeight());
    }else
        if (input.equals("T\r\n")) {
            tareWeight();
        }else
            if (input.startsWith("D ")) {
            }else
                if (input.startsWith("B")) {
                }else
                    if (input.startsWith("DW")) {
                        java.lang.System.out.println("Program stoppet, Q modtaget paa com port");
                    }
                
            
        
    
    return null;
}