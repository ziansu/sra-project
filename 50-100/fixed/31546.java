public static void addCable(advancedsystemsmanager.tileentities.TileEntityQuantumCable cable) {
    if (advancedsystemsmanager.tileentities.TileEntityQuantumCable.quantumRegistry.containsKey(cable.getQuantumKey())) {
        advancedsystemsmanager.tileentities.TileEntityQuantumCable.quantumRegistry.get(cable.getQuantumKey()).pairWith(cable);
    }else {
        advancedsystemsmanager.tileentities.TileEntityQuantumCable.quantumRegistry.put(cable.getQuantumKey(), cable);
    }
}