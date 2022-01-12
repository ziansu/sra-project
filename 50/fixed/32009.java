@com.error22.thelta.pipeline.StageMethod(stage = "craft_init_blocks", pass = com.error22.thelta.pipeline.Pass.PreInit)
private static void init_blocks() {
    com.error22.thelta.machines.Machines.blockConvayorT1 = new com.error22.thelta.machines.blocks.BlockConvayorBelt("convayorbeltt1");
    com.error22.thelta.machines.Machines.blockMachinearm = new com.error22.thelta.machines.blocks.BlockMachinearm("machinearm");
}