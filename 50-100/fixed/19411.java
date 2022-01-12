public java.lang.String listRange() {
    if ((range) <= 20)
        return "very short-ranged";
    else
        if ((range) <= 40)
            return "short-ranged";
        else
            if ((range) <= 60)
                return "mid-ranged";
            else
                if ((range) <= 80)
                    return "long-ranged";
                else
                    if ((range) <= 100)
                        return "very long-ranged";
                    else
                        return "impossibly far ranged";
                    
                
            
        
    
}