@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.sedc.core.model.StageYahooFxrate that = ((com.sedc.core.model.StageYahooFxrate) (o));
    return (name.equals(that.name)) && (date.equals(that.date));
}