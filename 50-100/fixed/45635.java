public static int missingMachines(Client.Entities.MachineType type, int capacity) {
    int missingUnits = 0;
    java.util.Map<Client.Entities.MachineType, java.lang.Integer> misUn = Client.Application.CompanyController.missingUnitsOnMachines();
    if (misUn.containsKey(type))
        missingUnits = Client.Application.CompanyController.missingUnitsOnMachines().get(type);
    else
        return 0;
    
    if (missingUnits == 0)
        return 0;
    
    int missMach = ((int) ((missingUnits / capacity) + 1));
    return missMach;
}