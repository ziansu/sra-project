@java.lang.Override
public void apply(org.eclipse.che.api.machine.shared.dto.MachineDto machine) throws org.eclipse.che.api.promises.client.OperationException {
    providers = getProviders(machine);
    commandPropertyRegistry.register(providers);
}