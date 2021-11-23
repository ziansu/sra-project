@java.lang.Override
public void updateEntity() {
    super.updateEntity();
    if (!(hasEnderChest()))
        return ;
    
    if (container.getWorldObj().isRemote) {
        return ;
    }
    if ((battery.getEnergyStored()) > 10) {
        if ((transport.getNumberOfStacks()) < (buildcraft.transport.PipeTransportItems.MAX_PIPE_STACKS)) {
            extractItems();
        }
        battery.setEnergy(0);
    }
}