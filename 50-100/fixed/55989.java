@java.lang.Override
public boolean isValid(java.lang.String[] array, javax.validation.ConstraintValidatorContext ctx) {
    if (array == null) {
        return false;
    }
    for (java.lang.String para : array) {
        if (para == null)
            return false;
        else
            if ((para.trim().length()) < 1)
                return false;
            
        
    }
    return true;
}