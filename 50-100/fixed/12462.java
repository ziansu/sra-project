public synchronized void setHMILevel(com.smartdevicelink.proxy.rpc.enums.HMILevel hmiVal) {
    hmiLevel = hmiVal;
    if (hmiVal != null) {
        if ((hmiVal.equals(HMILevel.HMI_FULL)) || (hmiVal.equals(HMILevel.HMI_LIMITED)))
            setUserSelectedStatus(true);
        else
            if (hmiVal.equals(HMILevel.HMI_NONE))
                setUserSelectedStatus(false);
            
        
    }else {
        setUserSelectedStatus(false);
    }
}