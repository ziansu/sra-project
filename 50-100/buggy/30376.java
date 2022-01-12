void prepare() {
    stage = 0;
    position = -1;
    intel.reset();
    boards[0] = "";
    for (int i = 1; i < (boards.length); i++)
        boards[i] = "UNKNOWN";
    
}