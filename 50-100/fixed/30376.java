void prepare(int position) {
    stage = 0;
    this.position = position;
    intel.reset();
    boards[0] = "";
    for (int i = 1; i < (boards.length); i++)
        boards[i] = "UNKNOWN";
    
}