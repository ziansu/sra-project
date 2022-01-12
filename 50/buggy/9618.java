public void setCPUIDCode(int i) {
    if ((i & 4095) == 1049) {
        cputype = axoloti.targetprofile.axoloti_core.cputype_e.STM32F42xxx;
    }else {
        cputype = axoloti.targetprofile.axoloti_core.cputype_e.STM32F40xxx;
    }
}