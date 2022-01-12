@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((re) == (((Complex) (o)).re))
        if ((im) == (((Complex) (o)).im))
            if ((theta) == (((Complex) (o)).theta))
                if (type.equals(((Complex) (o)).type))
                    return true;
                
            
        
    
    return false;
}