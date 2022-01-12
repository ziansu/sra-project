public void valueChanged(edu.wpi.first.wpilibj.tables.ITable source, java.lang.String key, java.lang.Object pvalue, boolean isNew) {
    if ((oldTestEnable) == ((boolean) (pvalue)))
        return ;
    
    oldTestEnable = ((boolean) (pvalue));
    if (((boolean) (pvalue))) {
        if (cpi.CANTalon.testList.contains(thisInstance))
            return ;
        
        cpi.CANTalon.testList.addElement(thisInstance);
    }else {
        cpi.CANTalon.testList.remove(thisInstance);
    }
}