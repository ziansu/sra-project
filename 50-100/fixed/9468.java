@java.lang.Override
public void updateEntity() {
    if (canGeneratePower()) {
        if (hasEnoughEnergyBuffer(getPowerPerOperation())) {
            if (!(worldObj.isRemote))
                this.energy.acceptEnergy(getPowerPerOperation(), false);
            
            onGeneratePower();
        }else
            notEnoughBufferForFunction();
        
    }
    if (!(worldObj.isRemote))
        transmitPower();
    
}