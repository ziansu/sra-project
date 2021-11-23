@java.lang.Override
public java.awt.Color toColor(java.lang.Object o) throws lucee.runtime.exp.PageException {
    if (o instanceof java.awt.Color)
        return ((java.awt.Color) (o));
    else
        if (o instanceof java.lang.CharSequence)
            return lucee.commons.color.ColorCaster.toColor(o.toString());
        else
            if (o instanceof java.lang.Number)
                return lucee.commons.color.ColorCaster.toColor(java.lang.Integer.toHexString(((java.lang.Number) (o)).intValue()));
            
        
    
    throw new lucee.runtime.exp.CasterException(o, java.awt.Color.class);
}